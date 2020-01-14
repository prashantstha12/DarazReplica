package com.example.darazreplica.bll;

import com.example.darazreplica.Url.Url;
import com.example.darazreplica.api.UserApi;
import com.example.darazreplica.serverresponse.SignUpResponse;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Response;

public class LoginBll {
    boolean isSuccess = false;

    public boolean checkUser(String username, String password){

        UserApi userApi = Url.getInstance().create(UserApi.class);
        Call<SignUpResponse> userCall =userApi.checkUser(username,password);

        try {
            Response<SignUpResponse> loginResponse = userCall.execute();
            if (loginResponse.isSuccessful()) {
                Url.token += loginResponse.body().getToken();
                isSuccess = true;
            }
        }
            catch(IOException e){
                e.printStackTrace();
            }

        return isSuccess;
    }
}
