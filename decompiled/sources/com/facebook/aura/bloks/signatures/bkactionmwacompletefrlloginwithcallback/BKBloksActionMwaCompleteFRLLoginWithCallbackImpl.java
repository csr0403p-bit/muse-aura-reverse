package com.facebook.aura.bloks.signatures.bkactionmwacompletefrlloginwithcallback;

import X.AbstractC7608F5v;
import X.AnonymousClass002;
import X.BV4;
import X.C7BY;
import X.C9jH;
import X.CFK;
import X.F6D;
import X.F9M;
import X.F9N;
import X.F9b;
import X.FBA;
import X.FBB;
import X.FBD;
import X.FDW;
import X.FGI;
import X.Hj6;
import X.HsM;
import android.util.SparseArray;
import com.facebook.aura.auth.postconsolidation.HatchPostConsolidationCredentialCarrier;
import com.facebook.aura.bloks.host.AuraBloksHost;
import com.instagram.common.bloks.BloksParseResult;
import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
public final class BKBloksActionMwaCompleteFRLLoginWithCallbackImpl {
    public static final BKBloksActionMwaCompleteFRLLoginWithCallbackImpl INSTANCE = new BKBloksActionMwaCompleteFRLLoginWithCallbackImpl();
    public static final String TAG = "BKBloksActionMwaCompleteFRLLoginWithCallbackImpl";

    public static final Object evaluate(Hj6 hj6, F6D f6d) {
        String str;
        BloksParseResult bloksParseResult;
        AuraBloksHost auraBloksHost;
        boolean zA1a = AnonymousClass002.A1a(hj6, f6d);
        Object obj = hj6.A01[0];
        String str2 = obj instanceof String ? (String) obj : null;
        if (str2 == null || C7BY.A0j(str2)) {
            CFK.A06(TAG, "Missing frl_access_token");
            return null;
        }
        Object obj2 = hj6.A01[zA1a ? 1 : 0];
        if (!(obj2 instanceof String) || (str = (String) obj2) == null || C7BY.A0j(str)) {
            CFK.A06(TAG, "Missing frl_account_id");
            return null;
        }
        Object obj3 = hj6.A01[2];
        if (!(obj3 instanceof BloksParseResult) || (bloksParseResult = (BloksParseResult) obj3) == null) {
            CFK.A06(TAG, "Missing logged_in_callback parse result");
            return null;
        }
        FDW fdw = bloksParseResult.A02;
        int i = fdw.A05;
        if (i != 22739) {
            CFK.A06(TAG, FGI.A0H("Unexpected callback style id: ", i));
            return null;
        }
        HsM hsMA0Z = AbstractC7608F5v.A0Z(fdw);
        if (hsMA0Z == null) {
            CFK.A06(TAG, "Callback carries no logged_in_callback expression");
            return null;
        }
        FBB fbb = f6d.A02;
        if (fbb == null) {
            CFK.A06(TAG, "No BloksContext to fork from");
            return null;
        }
        FBD fbd = fbb.A02;
        if (!(fbd instanceof AuraBloksHost) || (auraBloksHost = (AuraBloksHost) fbd) == null) {
            CFK.A06(TAG, "Host is not an AuraBloksHost");
            return null;
        }
        AuraBloksHost auraBloksHost2 = new AuraBloksHost(auraBloksHost.mFragmentManager, auraBloksHost.mFragmentActivity, auraBloksHost.mBloksConfig, HatchPostConsolidationCredentialCarrier.Companion.create(str, str2));
        SparseArray sparseArrayA0B = BV4.A0B();
        C9jH c9jH = C9jH.A00;
        F9b f9b = new F9b(bloksParseResult, F9N.A00);
        FBB fbbA01 = FBA.A01(fbb.A00, sparseArrayA0B, f9b, auraBloksHost2, bloksParseResult.mLoggingId);
        f9b.A03(fbbA01, new F9M(), FBA.A03(fbb).A04.A05);
        if (!c9jH.isEmpty()) {
            f9b.A06(bloksParseResult, BloksParseResult.A03(bloksParseResult.A01.A03, c9jH));
        }
        List listSingletonList = Collections.singletonList(fbbA01);
        Hj6 hj62 = new Hj6();
        Object[] array = listSingletonList.toArray();
        hj62.A01 = array;
        hj62.A00 = array.length;
        return F6D.A03(fbbA01, fdw, hj62, hsMA0Z);
    }
}
