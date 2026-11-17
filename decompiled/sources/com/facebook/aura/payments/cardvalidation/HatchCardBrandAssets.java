package com.facebook.aura.payments.cardvalidation;

import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C3cG;
import X.C7384Etj;
import com.facebook.aura.R;

/* loaded from: classes3.dex */
public final class HatchCardBrandAssets {
    public static final HatchCardBrandAssets INSTANCE = new HatchCardBrandAssets();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Integer forAssociationName(java.lang.String r5) {
        /*
            r4 = this;
            r3 = 0
            if (r5 == 0) goto L1c
            java.lang.String r0 = X.AnonymousClass002.A0l(r5)
            if (r0 == 0) goto L1c
            java.lang.String r2 = X.C60Q.A0g(r0)
            X.7l3 r1 = com.facebook.aura.payments.cardvalidation.HatchCardBrandAssetsKt.NON_ALPHANUMERIC
            java.lang.String r0 = ""
            java.lang.String r1 = r1.A03(r2, r0)
            int r0 = r1.hashCode()
            switch(r0) {
                case -2038717326: goto L4c;
                case -885176496: goto L41;
                case 105033: goto L36;
                case 2997727: goto L33;
                case 3619905: goto L28;
                case 273184745: goto L1d;
                default: goto L1c;
            }
        L1c:
            return r3
        L1d:
            java.lang.String r0 = "discover"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1c
            com.facebook.aura.payments.cardvalidation.HatchCardNetwork r0 = com.facebook.aura.payments.cardvalidation.HatchCardNetwork.DISCOVER
            goto L56
        L28:
            java.lang.String r0 = "visa"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1c
            com.facebook.aura.payments.cardvalidation.HatchCardNetwork r0 = com.facebook.aura.payments.cardvalidation.HatchCardNetwork.VISA
            goto L56
        L33:
            java.lang.String r0 = "amex"
            goto L43
        L36:
            java.lang.String r0 = "jcb"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1c
            com.facebook.aura.payments.cardvalidation.HatchCardNetwork r0 = com.facebook.aura.payments.cardvalidation.HatchCardNetwork.JCB
            goto L56
        L41:
            java.lang.String r0 = "americanexpress"
        L43:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1c
            com.facebook.aura.payments.cardvalidation.HatchCardNetwork r0 = com.facebook.aura.payments.cardvalidation.HatchCardNetwork.AMERICAN_EXPRESS
            goto L56
        L4c:
            java.lang.String r0 = "mastercard"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1c
            com.facebook.aura.payments.cardvalidation.HatchCardNetwork r0 = com.facebook.aura.payments.cardvalidation.HatchCardNetwork.MASTERCARD
        L56:
            java.lang.Integer r3 = r4.forNetwork(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.payments.cardvalidation.HatchCardBrandAssets.forAssociationName(java.lang.String):java.lang.Integer");
    }

    public final Integer forCardDigits(String str) {
        C7384Etj.A0Y(str, 0);
        return forNetwork(HatchCardNetwork.Companion.forDigits(HatchCardNetworkKt.digitsOnly(str)));
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HatchCardNetwork.values().length];
            try {
                AnonymousClass002.A13(HatchCardNetwork.VISA, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(HatchCardNetwork.MASTERCARD, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(HatchCardNetwork.AMERICAN_EXPRESS, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(HatchCardNetwork.DISCOVER, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(HatchCardNetwork.JCB, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(HatchCardNetwork.UNKNOWN, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final Integer forNetwork(HatchCardNetwork hatchCardNetwork) {
        int i;
        switch (AnonymousClass003.A0L(hatchCardNetwork)) {
            case 0:
                i = R.drawable.visa;
                break;
            case 1:
                i = R.drawable.mastercard;
                break;
            case 2:
                i = R.drawable.amex;
                break;
            case 3:
                i = R.drawable.discover;
                break;
            case 4:
                i = R.drawable.jcb;
                break;
            case 5:
                return null;
            default:
                throw C3cG.A0q();
        }
        return Integer.valueOf(i);
    }
}
