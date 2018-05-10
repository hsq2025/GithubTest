package com.hsq.mylibrary;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.view.View;

/**
 * Created by Administrator on 2017/6/8.
 */
public class NetworkUtil {
    
    public static boolean isConnectToNetwork(Context context){
        ConnectivityManager conn = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo info = conn.getActiveNetworkInfo();
        return info != null && info.isConnected();
    }

    public static boolean isMobileNetwork(Context context){
        ConnectivityManager conn = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo info = conn.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
        return info != null && info.isConnected();
    }

    public static boolean isWifiNetwork(Context context){
        ConnectivityManager conn = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo info = conn.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
        return info != null && info.isConnected();
    }

    public static void showNetworkView(View view, Context context){
        if (NetworkUtil.isConnectToNetwork(context)) {
            view.setVisibility(View.GONE);
        } else {
            view.setVisibility(View.VISIBLE);
        }
    }

//    public static void setNetworkType(Context context){//修改
//        if (HomeActivity.homeActivity == null)
//            return;
//        if (isWifiNetwork(context)) {
//            if (HomeActivity.homeActivity.isVpnTurnOn) {
//                HomeActivity.homeActivity.tv_flow_privilege.setText("当前为WIFI网络，无需使用特权流量");
//            } else {
//                HomeActivity.homeActivity.tv_flow_privilege.setText("当前为WIFI网络，无需使用特权流量");
//            }
//        } else if (isMobileNetwork(context)) {
//            if (HomeActivity.homeActivity.isVpnTurnOn) {
//                HomeActivity.homeActivity.tv_flow_privilege.setText("正在使用特权流量");
//            } else {
//                HomeActivity.homeActivity.tv_flow_privilege.setText("当前未使用特权流量");
//            }
//        } else {
//            HomeActivity.homeActivity.tv_flow_privilege.setText("无法连接网络");
//        }
//    }
}
