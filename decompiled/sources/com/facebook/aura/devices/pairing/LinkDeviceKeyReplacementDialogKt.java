package com.facebook.aura.devices.pairing;

import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.B1U;
import X.B1V;
import X.BA2;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C78N;
import X.G0U;
import X.G0V;
import android.text.format.DateUtils;
import com.facebook.aura.R;
import com.facebook.aura.devices.token.LinkDeviceKeyRecord;
import com.facebook.aura.vds.compose.dialog.AuraAlertDialogKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class LinkDeviceKeyReplacementDialogKt {

    /* renamed from: com.facebook.aura.devices.pairing.LinkDeviceKeyReplacementDialogKt$LinkDeviceKeyReplacementDialog$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ String $cancelText;
        public final /* synthetic */ G0U<Boolean, Unit> $onResolve;
        public final /* synthetic */ String $replaceText;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(String str, G0U<? super Boolean, Unit> g0u, String str2) {
            super(2);
            this.$replaceText = str;
            this.$onResolve = g0u;
            this.$cancelText = str2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$cancelText, AnonymousClass001.A1R(bfm, this.$onResolve, bfm.A65(this.$replaceText)));
                String str = this.$replaceText;
                String str2 = this.$cancelText;
                G0U<Boolean, Unit> g0u = this.$onResolve;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new LinkDeviceKeyReplacementDialogKt$LinkDeviceKeyReplacementDialog$1$1$1(str, str2, g0u);
                    bfm.Ai0(objAaT);
                }
                AnonymousClass007.A14(bfm, objAaT);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.devices.pairing.LinkDeviceKeyReplacementDialogKt$LinkDeviceKeyReplacementDialog$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ LinkDeviceKeyRecord $existing;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<Boolean, Unit> $onResolve;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(LinkDeviceKeyRecord linkDeviceKeyRecord, G0U<? super Boolean, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$existing = linkDeviceKeyRecord;
            this.$onResolve = g0u;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            LinkDeviceKeyReplacementDialogKt.LinkDeviceKeyReplacementDialog(this.$existing, this.$onResolve, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void LinkDeviceKeyReplacementDialog(LinkDeviceKeyRecord linkDeviceKeyRecord, G0U<? super Boolean, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        int i3;
        Object[] objArr;
        BRg bRg2 = bRg;
        boolean zA1b = AnonymousClass004.A1b(linkDeviceKeyRecord, g0u);
        bfm.AgG(2109559659);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, linkDeviceKeyRecord) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, g0u);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 147, 146), bfm, iA0T)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            Long l = linkDeviceKeyRecord.lastSeenAtMs;
            if (l == null) {
                bfm.AgE(1930570789);
                i3 = R.string.device_pairing_link_replace_body_never_connected;
                objArr = new Object[]{linkDeviceKeyRecord.label};
            } else {
                bfm.AgE(1930728083);
                i3 = R.string.device_pairing_link_replace_body;
                objArr = new Object[]{linkDeviceKeyRecord.label, DateUtils.getRelativeTimeSpanString(l.longValue(), System.currentTimeMillis(), 60000L).toString()};
            }
            String strA02 = AbstractC2271BQs.A02(bfm, objArr, i3);
            AnonymousClass001.A1D(bfm);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string.device_pairing_link_replace);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string.device_pairing_link_replace_cancel);
            String strA013 = AbstractC2271BQs.A01(bfm, R.string.device_pairing_link_replace_title);
            B1U b1uA00 = B1V.A00(bfm, new AnonymousClass1(strA01, g0u, strA012), 1697385020);
            boolean zA1N = AnonymousClass001.A1N(iA0T);
            Object objAaT = bfm.AaT();
            if (zA1N || objAaT == C78N.A00) {
                objAaT = new LinkDeviceKeyReplacementDialogKt$LinkDeviceKeyReplacementDialog$2$1(g0u);
                bfm.Ai0(objAaT);
            }
            AuraAlertDialogKt.AuraAlertDialog(bRg2, strA013, strA02, (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) null, b1uA00, (Function0<Unit>) objAaT, (BA2) null, zA1b, zA1b, (G0U<? super String, Unit>) null, bfm, ((iA0T >> 6) & 14) | 196608, zA1b ? 1 : 0, 1944);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(linkDeviceKeyRecord, g0u, bRg2, i, i2);
        }
    }
}
