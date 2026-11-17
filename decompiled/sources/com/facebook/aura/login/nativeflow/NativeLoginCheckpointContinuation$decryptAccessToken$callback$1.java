package com.facebook.aura.login.nativeflow;

import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AnonymousClass001;
import X.BFI;
import X.BQG;
import X.C05706tk;
import X.C07338im;
import X.C10571Hud;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C60P;
import X.C6th;
import X.C7384Etj;
import X.CFK;
import X.G0V;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import android.net.Uri;
import com.facebook.aura.network.sandbox.AuraSandbox;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginCheckpointContinuation$decryptAccessToken$callback$1", f = "NativeLoginCheckpointContinuation.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class NativeLoginCheckpointContinuation$decryptAccessToken$callback$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super C05706tk>, Object> {
    public final /* synthetic */ String $rawUrl;
    public final /* synthetic */ String $resumeToken;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginCheckpointContinuation$decryptAccessToken$callback$1(String str, String str2, HtJ<? super NativeLoginCheckpointContinuation$decryptAccessToken$callback$1> htJ) {
        super(2, htJ);
        this.$rawUrl = str;
        this.$resumeToken = str2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new NativeLoginCheckpointContinuation$decryptAccessToken$callback$1(this.$rawUrl, this.$resumeToken, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object objA0s;
        Uri uriA00;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        String str = this.$rawUrl;
        String str2 = this.$resumeToken;
        boolean zIsHttpSandboxEnabled = AuraSandbox.INSTANCE.isHttpSandboxEnabled();
        boolean zA1Y = C60P.A1Y(str, str2);
        try {
            uriA00 = C6th.A00(str, zIsHttpSandboxEnabled);
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if (uriA00 != null && C6th.A02(uriA00)) {
            List<String> listA01 = C6th.A01(uriA00, "token");
            List<String> listA012 = C6th.A01(uriA00, NativeLoginCheckpointContinuationKt.BLOB_PARAM);
            if (listA01.size() == zA1Y && listA012.size() == zA1Y) {
                String str3 = (String) AbstractC0878AGe.A0J(listA01);
                String str4 = (String) AbstractC0878AGe.A0J(listA012);
                if (str3.length() != 0 && str4.length() != 0) {
                    byte[] bArrA1T = C3cH.A1T(str2);
                    C7384Etj.A0U(bArrA1T);
                    if (str3.equals(BQG.A17(BFI.A0C("", new C07338im(12), bArrA1T), 16))) {
                        objA0s = new C05706tk(str4);
                        if (HsJ.A00(objA0s) != null) {
                            CFK.A06("MetaWebLoginCallbackParser", "callback validation failed");
                        }
                        if (!(objA0s instanceof C10571Hud)) {
                            return objA0s;
                        }
                    }
                }
            }
        }
        return null;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super C05706tk> htJ) {
        return ((NativeLoginCheckpointContinuation$decryptAccessToken$callback$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
