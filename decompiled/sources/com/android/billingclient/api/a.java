package com.android.billingclient.api;

import X.C9541GNx;
import X.EnumC9535GNn;
import X.EnumC9540GNw;
import X.G4i;
import X.GI0;
import X.GNK;
import X.GNM;
import X.GNN;
import X.GNT;
import X.GNW;
import X.GNr;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;

/* loaded from: classes6.dex */
public final class a extends BroadcastReceiver {
    public boolean A00;
    public final boolean A01;
    public final /* synthetic */ GNW A02;

    public final synchronized void A01(Context context) {
        if (this.A00) {
            context.unregisterReceiver(this);
            this.A00 = false;
        } else {
            GNN.A06("BillingBroadcastManager", "Receiver is not registered.");
        }
    }

    public final synchronized void A02(Context context, IntentFilter intentFilter) {
        if (!this.A00) {
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this, intentFilter, this.A01 ? 2 : 4);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.A00 = true;
        }
    }

    public final synchronized void A03(Context context, IntentFilter intentFilter) {
        if (!this.A00) {
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, this.A01 ? 2 : 4);
            } else {
                context.registerReceiver(this, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
            }
            this.A00 = true;
        }
    }

    public a(GNW gnw, boolean z) {
        this.A02 = gnw;
        this.A01 = z;
    }

    private final void A00(Bundle bundle, GNM gnm, EnumC9540GNw enumC9540GNw, G4i g4i, long j, boolean z) {
        try {
            byte[] byteArray = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
            GNW gnw = this.A02;
            if (byteArray == null) {
                ((GNT) gnw.A05).A06(GNr.A00(gnm, enumC9540GNw, EnumC9535GNn.A2E, g4i, null), j, z);
            } else {
                GNK gnk = gnw.A05;
                GNT gnt = (GNT) gnk;
                gnt.A06((C9541GNx) GI0.A00(C9541GNx.DEFAULT_INSTANCE, bundle.getByteArray("FAILURE_LOGGING_PAYLOAD")), j, z);
            }
        } catch (Throwable unused) {
            GNN.A06("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't wrap try/catch for region: R(7:39|(2:51|(5:53|122|56|(14:(15:59|61|(1:63)|65|(1:67)|68|(2:69|(1:128)(4:71|(1:73)|74|(7:129|76|(2:79|77)|131|80|(1:82)|83)(1:130)))|84|120|85|(1:87)(1:89)|88|90|(1:92)|93)(1:60)|64|65|(0)|68|(3:69|(0)(0)|130)|84|120|85|(0)(0)|88|90|(0)|93)(1:96)|98)(1:54))(3:42|(4:47|(2:49|126)(1:127)|50|43)|125)|55|122|56|(0)(0)|98) */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x02f8, code lost:
    
        X.GNN.A06("BillingBroadcastManager", "Failed logging purchase extraction results.");
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x024f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0010  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d2 A[Catch: all -> 0x02f8, TryCatch #1 {all -> 0x02f8, blocks: (B:56:0x018a, B:61:0x0198, B:63:0x019e, B:64:0x01a0, B:65:0x01b9, B:67:0x01d2, B:68:0x01de, B:69:0x01e5, B:71:0x01eb, B:73:0x01f9, B:74:0x01fb, B:76:0x01ff, B:77:0x020d, B:79:0x0213, B:80:0x022c, B:82:0x0238, B:83:0x023e, B:84:0x024f, B:90:0x02d1, B:95:0x02e2, B:60:0x0195, B:96:0x02e6, B:85:0x0290, B:87:0x029a, B:88:0x029e, B:92:0x02d7, B:93:0x02dd, B:89:0x02ce), top: B:122:0x018a, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01eb A[Catch: all -> 0x02f8, TryCatch #1 {all -> 0x02f8, blocks: (B:56:0x018a, B:61:0x0198, B:63:0x019e, B:64:0x01a0, B:65:0x01b9, B:67:0x01d2, B:68:0x01de, B:69:0x01e5, B:71:0x01eb, B:73:0x01f9, B:74:0x01fb, B:76:0x01ff, B:77:0x020d, B:79:0x0213, B:80:0x022c, B:82:0x0238, B:83:0x023e, B:84:0x024f, B:90:0x02d1, B:95:0x02e2, B:60:0x0195, B:96:0x02e6, B:85:0x0290, B:87:0x029a, B:88:0x029e, B:92:0x02d7, B:93:0x02dd, B:89:0x02ce), top: B:122:0x018a, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x029a A[Catch: all -> 0x02e1, TryCatch #0 {all -> 0x02e1, blocks: (B:85:0x0290, B:87:0x029a, B:88:0x029e, B:92:0x02d7, B:93:0x02dd, B:89:0x02ce), top: B:120:0x0290, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02ce A[Catch: all -> 0x02e1, TRY_LEAVE, TryCatch #0 {all -> 0x02e1, blocks: (B:85:0x0290, B:87:0x029a, B:88:0x029e, B:92:0x02d7, B:93:0x02dd, B:89:0x02ce), top: B:120:0x0290, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02d7 A[Catch: all -> 0x02e1, TRY_ENTER, TryCatch #0 {all -> 0x02e1, blocks: (B:85:0x0290, B:87:0x029a, B:88:0x029e, B:92:0x02d7, B:93:0x02dd, B:89:0x02ce), top: B:120:0x0290, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02e6 A[Catch: all -> 0x02f8, TRY_LEAVE, TryCatch #1 {all -> 0x02f8, blocks: (B:56:0x018a, B:61:0x0198, B:63:0x019e, B:64:0x01a0, B:65:0x01b9, B:67:0x01d2, B:68:0x01de, B:69:0x01e5, B:71:0x01eb, B:73:0x01f9, B:74:0x01fb, B:76:0x01ff, B:77:0x020d, B:79:0x0213, B:80:0x022c, B:82:0x0238, B:83:0x023e, B:84:0x024f, B:90:0x02d1, B:95:0x02e2, B:60:0x0195, B:96:0x02e6, B:85:0x0290, B:87:0x029a, B:88:0x029e, B:92:0x02d7, B:93:0x02dd, B:89:0x02ce), top: B:122:0x018a, inners: #0 }] */
    /* JADX WARN: Type inference failed for: r0v90, types: [X.Hwq] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.AGi] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onReceive(android.content.Context r24, android.content.Intent r25) {
        /*
            Method dump skipped, instructions count: 906
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.a.onReceive(android.content.Context, android.content.Intent):void");
    }
}
