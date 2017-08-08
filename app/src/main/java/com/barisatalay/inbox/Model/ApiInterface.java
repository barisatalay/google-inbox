package com.barisatalay.inbox.Model;

import com.barisatalay.inbox.Common.Const.Api;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by baris on 8.08.2017.
 */

public interface ApiInterface {
    @GET(Api.Inbox)
    Call<List<Message>> getInbox();
}
