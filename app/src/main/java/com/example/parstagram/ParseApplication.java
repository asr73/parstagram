package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("VobZlM7O6sPB5j0UcnQvtD0sHki8kaNMYJxGnR6K")
                .clientKey("4dQVX38Tqa5INxQRKara0lOMI9tvSyPTUxxJGwhU")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
