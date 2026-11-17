package com.facebook.aura.navigation.key;

import X.AnonymousClass003;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C3cJ;
import X.C5hV;
import X.C7384Etj;
import X.C9cd;
import X.C9hr;
import X.C9iK;
import X.C9iZ;
import X.C9j4;
import X.C9j5;
import X.F0C;
import X.Hs1;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import com.facebook.aura.analytics.hatch.HatchSkillOAuthOrigin;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class MessengerResetPinSheetKey$$serializer implements C9cd<MessengerResetPinSheetKey> {
    public static final MessengerResetPinSheetKey$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final MessengerResetPinSheetKey deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = MessengerResetPinSheetKey.$childSerializers;
        String strA0v = null;
        MessengerPinLockoutReason messengerPinLockoutReason = null;
        HatchSkillOAuthOrigin hatchSkillOAuthOrigin = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new MessengerResetPinSheetKey(i, strA0v, messengerPinLockoutReason, hatchSkillOAuthOrigin, (C2hx) null);
            }
            if (iA8N == 0) {
                strA0v = C3cI.A0v(c9iZ, c9j4A55, 0);
                i |= 1;
            } else if (iA8N == 1) {
                messengerPinLockoutReason = (MessengerPinLockoutReason) C3cJ.A0F(c9iZ, c9j4A55, f0cArr, 1);
                i |= 2;
            } else {
                if (iA8N != 2) {
                    throw C3cG.A17(iA8N);
                }
                hatchSkillOAuthOrigin = (HatchSkillOAuthOrigin) C3cJ.A0F(c9iZ, c9j4A55, f0cArr, 2);
                i |= 4;
            }
        }
    }

    static {
        MessengerResetPinSheetKey$$serializer messengerResetPinSheetKey$$serializer = new MessengerResetPinSheetKey$$serializer();
        INSTANCE = messengerResetPinSheetKey$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.navigation.key.MessengerResetPinSheetKey", messengerResetPinSheetKey$$serializer, 3);
        C3cI.A1Q("iconUrl", c9iKA1C, true);
        c9iKA1C.A08("origin", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        F0C<C9hr<Object>>[] f0cArr = MessengerResetPinSheetKey.$childSerializers;
        return new C9hr[]{C3cG.A15(), C3cH.A10(f0cArr), C3cH.A11(f0cArr)};
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return descriptor;
    }

    @Override // X.C9cd
    public /* bridge */ C9hr<?>[] typeParametersSerializers() {
        return C5hV.A00;
    }

    @Override // X.C9hv
    public final void serialize(InterfaceC07789is interfaceC07789is, MessengerResetPinSheetKey messengerResetPinSheetKey) {
        AnonymousClass003.A0u(interfaceC07789is, messengerResetPinSheetKey);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        MessengerResetPinSheetKey.write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(messengerResetPinSheetKey, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
