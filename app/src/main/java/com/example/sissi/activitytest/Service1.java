package com.example.sissi.activitytest;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

//服务一般需要将主要工作放在独立线程做以减轻主线程负担。或者干脆运行在独立的进程。　
// 若服务运行在单独的进程且存在自定义的Application则当服务启动时会重新走一遍Application.onCreate
// 官方建议一般不需要自定义Application，然而启动任意组件时（若应用尚未在当前进程运行）触发Application.onCreate回调　
//有时又是有用的，比如想支持从任意activity进入app（这很有用），有些全局的初始化工作就可以放在Application.onCreate中。
//　这样能保证从应用的任意组件进入时应用被正确初始化了。
public class Service1 extends Service {
//    public Service1() {
//    }

    @Override
    public void onCreate() {//　服务生命周期内仅执行一次，即便外部多次调用startService
        PcTrace.p("-=->");
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) { // 该回调可能执行多次，一次startService对应一次。
        PcTrace.p("-=->");
//        return super.onStartCommand(intent, flags, startId);
//        return START_NOT_STICKY;
        return START_STICKY;  // 服务启动后会一直运行直到外部调用stopService或自己调用stopSelf
    }

    @Override
    public void onDestroy() {// 该回调不一定执行，用户强杀并不会走到该回调
        PcTrace.p("-=->");
        super.onDestroy();
    }

    @Override
    public void onRebind(Intent intent) {
        PcTrace.p("-=->");
        super.onRebind(intent);
    }

    @Override
    public IBinder onBind(Intent intent) {  // 绑定式服务较复杂，需谨慎使用
        PcTrace.p("-=->");
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
