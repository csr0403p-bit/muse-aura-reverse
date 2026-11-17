package com.facebook.aura.navigation;

import X.AbstractC10623Hzj;
import X.BFM;
import X.C0981AMm;
import X.C1BO;
import X.C20Q;
import X.C7384Etj;
import X.C79;
import X.F60;
import X.Hu1;
import X.HzR;

/* loaded from: classes2.dex */
public final class ResultEventBus {
    public static final int $stable = 0;
    public final C0981AMm<String, HzR<Object>> channelMap = new C0981AMm<>();

    public final C20Q<Object> getResultFlow$fbandroid_express_aura_java_com_facebook_aura_navigation_navigation(String str) {
        C7384Etj.A0Y(str, 0);
        if (!this.channelMap.containsKey(str)) {
            this.channelMap.put(str, AbstractC10623Hzj.A00(C79.A00, -2));
        }
        HzR<Object> hzR = this.channelMap.get(str);
        C7384Etj.A0X(hzR);
        return Hu1.A01(hzR);
    }

    public final void removeResult(String str) {
        C7384Etj.A0Y(str, 0);
        HzR<Object> hzRRemove = this.channelMap.remove(str);
        if (hzRRemove != null) {
            hzRRemove.A6R(null);
        }
    }

    public final C0981AMm<String, HzR<Object>> getChannelMap$fbandroid_express_aura_java_com_facebook_aura_navigation_navigation() {
        return this.channelMap;
    }

    public final /* synthetic */ <T> C1BO<T> conflateAsState(T t, BFM bfm, int i) {
        C7384Etj.A0Q();
        throw F60.createAndThrow();
    }

    public final /* synthetic */ <T> void sendResult(T t) {
        C7384Etj.A0Q();
        throw F60.createAndThrow();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> X.C1BO<T> conflateAsState(java.lang.String r4, T r5, X.BFM r6, int r7) {
        /*
            r3 = this;
            int r0 = X.AnonymousClass006.A0E(r4, r7)
            r0 = r0 ^ 6
            r2 = 4
            if (r0 <= r2) goto Lf
            boolean r0 = r6.A65(r4)
            if (r0 != 0) goto L14
        Lf:
            r1 = r7 & 6
            r0 = 0
            if (r1 != r2) goto L15
        L14:
            r0 = 1
        L15:
            java.lang.Object r2 = r6.AaT()
            if (r0 != 0) goto L1f
            java.lang.Object r0 = X.C78N.A00
            if (r2 != r0) goto L26
        L1f:
            X.20Q r2 = r3.getResultFlow$fbandroid_express_aura_java_com_facebook_aura_navigation_navigation(r4)
            r6.Ai0(r2)
        L26:
            X.20Q r2 = (X.C20Q) r2
            r1 = 0
            r0 = 2
            androidx.compose.runtime.MutableState r1 = X.C6v3.A00(r6, r5, r1, r2, r0)
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.runtime.State<T of com.facebook.aura.navigation.ResultEventBus.conflateAsState>"
            X.C7384Etj.A0Z(r1, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.navigation.ResultEventBus.conflateAsState(java.lang.String, java.lang.Object, X.BFM, int):X.1BO");
    }

    public final /* synthetic */ <T> void removeResult() {
        C7384Etj.A0Q();
        throw F60.createAndThrow();
    }

    public final <T> void sendResult(String str, T t) {
        C7384Etj.A0Y(str, 0);
        if (!this.channelMap.containsKey(str)) {
            this.channelMap.put(str, AbstractC10623Hzj.A00(C79.A00, -2));
        }
        HzR<Object> hzR = this.channelMap.get(str);
        if (hzR != null) {
            hzR.AhZ(t);
        }
    }
}
