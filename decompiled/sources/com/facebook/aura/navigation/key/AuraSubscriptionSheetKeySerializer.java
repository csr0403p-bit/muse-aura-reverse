package com.facebook.aura.navigation.key;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C3cG;
import X.C7384Etj;
import X.C9hr;
import X.C9iY;
import X.C9iZ;
import X.C9j4;
import X.C9j5;
import X.FGI;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import com.facebook.aura.navigation.key.AuraSubscriptionPage;
import kotlinx.serialization.SerializationException;

/* loaded from: classes4.dex */
public final class AuraSubscriptionSheetKeySerializer implements C9hr<AuraSubscriptionSheetKey> {
    public static final AuraSubscriptionSheetKeySerializer INSTANCE = new AuraSubscriptionSheetKeySerializer();
    public static final C9hr<AuraSubscriptionPage> pageSerializer = AuraSubscriptionPage.Companion.serializer();
    public static final C9hr<SubscriptionPaywallEntryPoint> entryPointSerializer = AnonymousClass001.A12(SubscriptionPaywallEntryPoint.$cachedSerializer$delegate);
    public static final C9hr<String> canonicalEntryPointSerializer = C3cG.A15();
    public static final C9iZ descriptor = C9iY.A01("com.facebook.aura.navigation.key.AuraSubscriptionSheetKey", AuraSubscriptionSheetKeySerializer$descriptor$1.INSTANCE);

    @Override // X.C9jG
    public AuraSubscriptionSheetKey deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        AuraSubscriptionPage auraSubscriptionPage = AuraSubscriptionPage.Usage.INSTANCE;
        SubscriptionPaywallEntryPoint subscriptionPaywallEntryPoint = SubscriptionPaywallEntryPoint.DEFAULT;
        String str = null;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                AuraSubscriptionSheetKey auraSubscriptionSheetKey = new AuraSubscriptionSheetKey(auraSubscriptionPage, subscriptionPaywallEntryPoint, str);
                c9j4A55.AAd(c9iZ);
                return auraSubscriptionSheetKey;
            }
            if (iA8N == 0) {
                auraSubscriptionPage = (AuraSubscriptionPage) c9j4A55.A8a(pageSerializer, c9iZ, 0);
            } else if (iA8N == 1) {
                subscriptionPaywallEntryPoint = (SubscriptionPaywallEntryPoint) c9j4A55.A8a(entryPointSerializer, c9iZ, 1);
            } else {
                if (iA8N != 2) {
                    throw new SerializationException(FGI.A0H("Unknown subscription sheet field index: ", iA8N));
                }
                str = (String) c9j4A55.A8a(canonicalEntryPointSerializer, c9iZ, 2);
            }
        }
    }

    @Override // X.C9hv
    public void serialize(InterfaceC07789is interfaceC07789is, AuraSubscriptionSheetKey auraSubscriptionSheetKey) {
        boolean zA1a = AnonymousClass002.A1a(interfaceC07789is, auraSubscriptionSheetKey);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        c9j5A56.AAQ(auraSubscriptionSheetKey.initialPage, pageSerializer, c9iZ, 0);
        c9j5A56.AAQ(auraSubscriptionSheetKey.entryPoint, entryPointSerializer, c9iZ, zA1a ? 1 : 0);
        c9j5A56.AAQ(auraSubscriptionSheetKey.canonicalNmeEntryPoint, canonicalEntryPointSerializer, c9iZ, 2);
        c9j5A56.AAd(c9iZ);
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public C9iZ getDescriptor() {
        return descriptor;
    }
}
