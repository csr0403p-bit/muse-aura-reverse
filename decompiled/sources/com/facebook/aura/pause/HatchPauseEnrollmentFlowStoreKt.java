package com.facebook.aura.pause;

import X.AbstractC9266GBt;
import X.C07338im;
import X.C31u;
import X.C6JO;
import X.C6LS;
import X.C7354EnR;
import X.C78W;
import X.GBK;
import X.HlU;
import X.InterfaceC7359EnW;
import android.content.Context;
import androidx.datastore.preferences.core.Preferences;

/* loaded from: classes3.dex */
public abstract class HatchPauseEnrollmentFlowStoreKt {
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = {new C7354EnR(HatchPauseEnrollmentFlowStoreKt.class, "pauseHatchFlowDataStore", "getPauseHatchFlowDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1)};
    public static final C31u pauseHatchFlowDataStore$delegate;

    static {
        C07338im c07338im = new C07338im(2);
        GBK gbk = AbstractC9266GBt.A00;
        pauseHatchFlowDataStore$delegate = new C6LS("lock_hatch_flow", c07338im, C78W.A04(HlU.A01));
    }

    public static final C6JO<Preferences> getPauseHatchFlowDataStore(Context context) {
        return (C6JO) pauseHatchFlowDataStore$delegate.getValue(context, $$delegatedProperties[0]);
    }
}
