package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass011;
import X.BFM;
import X.G0V;
import com.facebook.aura.navigation.key.CheckoutLodgingPolicy;
import kotlin.Unit;

/* loaded from: classes2.dex */
public abstract class CheckoutLodgingPolicySheetKt {

    /* renamed from: com.facebook.aura.agentpermission.CheckoutLodgingPolicySheetKt$CheckoutLodgingPolicySheet$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $approvalId;
        public final /* synthetic */ CheckoutLodgingPolicy $policy;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(String str, CheckoutLodgingPolicy checkoutLodgingPolicy, int i) {
            super(2);
            this.$approvalId = str;
            this.$policy = checkoutLodgingPolicy;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            CheckoutLodgingPolicySheetKt.CheckoutLodgingPolicySheet(this.$approvalId, this.$policy, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void CheckoutLodgingPolicySheet(java.lang.String r19, com.facebook.aura.navigation.key.CheckoutLodgingPolicy r20, X.BFM r21, int r22) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.CheckoutLodgingPolicySheetKt.CheckoutLodgingPolicySheet(java.lang.String, com.facebook.aura.navigation.key.CheckoutLodgingPolicy, X.BFM, int):void");
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CheckoutLodgingPolicy.values().length];
            try {
                AnonymousClass002.A13(CheckoutLodgingPolicy.CANCELLATION, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(CheckoutLodgingPolicy.TAXES_AND_FEES, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
