package com.google.android.play.core.appupdate;

import X.BV4;
import X.C3399CJq;
import X.C3cG;
import X.C60O;
import X.CJT;
import X.CK9;
import X.CLD;
import X.CSE;
import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.play.core.install.InstallException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes5.dex */
public final class zzq extends zzo {
    public final /* synthetic */ C3399CJq A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzq(CSE cse, C3399CJq c3399CJq) {
        super(cse, new CJT("OnRequestInstallCallback"), c3399CJq);
        this.A00 = c3399CJq;
    }

    @Override // com.google.android.play.core.appupdate.zzo, com.google.android.play.core.appupdate.internal.zzh
    public final void AjW(Bundle bundle) {
        super.AjW(bundle);
        CJT cjt = C3399CJq.A03;
        int i = bundle.getInt("error.code", -2);
        CSE cse = super.A00;
        if (i != 0) {
            cse.A01(new InstallException(bundle.getInt("error.code", -2)));
            return;
        }
        C3399CJq c3399CJq = this.A00;
        int i2 = bundle.getInt("version.code", -1);
        int i3 = bundle.getInt("update.availability");
        int i4 = bundle.getInt("install.status", 0);
        Integer numValueOf = bundle.getInt("client.version.staleness", -1) == -1 ? null : Integer.valueOf(bundle.getInt("client.version.staleness"));
        bundle.getInt("in.app.update.priority", 0);
        long j = bundle.getLong("bytes.downloaded");
        long j2 = bundle.getLong("total.bytes.to.download");
        bundle.getLong("additional.size.required");
        CK9.A00(C3cG.A0O(c3399CJq.A02.A00.getFilesDir(), "assetpacks"));
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("blocking.intent");
        PendingIntent pendingIntent2 = (PendingIntent) bundle.getParcelable("nonblocking.intent");
        PendingIntent pendingIntent3 = (PendingIntent) bundle.getParcelable("blocking.destructive.intent");
        PendingIntent pendingIntent4 = (PendingIntent) bundle.getParcelable("nonblocking.destructive.intent");
        HashMap mapA0u = BV4.A0u();
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("update.precondition.failures:blocking.destructive.intent");
        HashSet hashSetA13 = C60O.A13();
        if (integerArrayList != null) {
            hashSetA13.addAll(integerArrayList);
        }
        mapA0u.put("blocking.destructive.intent", hashSetA13);
        ArrayList<Integer> integerArrayList2 = bundle.getIntegerArrayList("update.precondition.failures:nonblocking.destructive.intent");
        HashSet hashSetA132 = C60O.A13();
        if (integerArrayList2 != null) {
            hashSetA132.addAll(integerArrayList2);
        }
        mapA0u.put("nonblocking.destructive.intent", hashSetA132);
        ArrayList<Integer> integerArrayList3 = bundle.getIntegerArrayList("update.precondition.failures:blocking.intent");
        HashSet hashSetA133 = C60O.A13();
        if (integerArrayList3 != null) {
            hashSetA133.addAll(integerArrayList3);
        }
        mapA0u.put("blocking.intent", hashSetA133);
        ArrayList<Integer> integerArrayList4 = bundle.getIntegerArrayList("update.precondition.failures:nonblocking.intent");
        HashSet hashSetA134 = C60O.A13();
        if (integerArrayList4 != null) {
            hashSetA134.addAll(integerArrayList4);
        }
        mapA0u.put("nonblocking.intent", hashSetA134);
        cse.A00.A0H(new CLD(pendingIntent, pendingIntent2, pendingIntent3, pendingIntent4, numValueOf, mapA0u, i2, i3, i4, j, j2));
    }
}
