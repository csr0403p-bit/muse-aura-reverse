package com.facebook.aura.login.nativeflow;

import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AuJ;
import X.BFM;
import X.BRg;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0W;
import com.facebook.aura.R;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class NativeLoginBirthdayScreenKt$NativeLoginNameFields$last$1 extends AbstractC7559F3s implements G0W<BRg, BFM, Integer, Unit> {
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ String $lastName;
    public final /* synthetic */ G0U<String, Unit> $onLastNameChange;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NativeLoginBirthdayScreenKt$NativeLoginNameFields$last$1(String str, G0U<? super String, Unit> g0u, boolean z) {
        super(3);
        this.$lastName = str;
        this.$onLastNameChange = g0u;
        this.$enabled = z;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(BRg bRg, BFM bfm, Integer num) {
        invoke(bRg, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BRg bRg, BFM bfm, int i) {
        int iA0d = i;
        C7384Etj.A0Y(bRg, 0);
        if ((i & 6) == 0) {
            iA0d = i | AnonymousClass004.A0d(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1204d3);
            AuJ auJ = new AuJ(null, 2, 0, 7);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = NativeLoginBirthdayScreenKt$NativeLoginNameFields$last$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            NativeLoginCommonKt.m1282NativeLoginTextFieldWHTdp1U(this.$lastName, this.$onLastNameChange, strA01, AnonymousClass001.A0Y(bRg, objAaT, false), this.$enabled, false, auJ, null, false, null, null, 0, null, null, 0L, null, bfm, 1572864, 0, 65440);
            return;
        }
        bfm.Afo();
    }
}
