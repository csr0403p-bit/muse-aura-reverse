package com.facebook.aura.login.nativeflow;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.C3cG;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.NativeLoginLandingScreenKey;
import com.facebook.aura.navigation.key.NativeLoginPhoneEntryScreenKey;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class NativeLoginRoutesKt$NativeLoginIntroRoute$2$1 extends AbstractC7559F3s implements G0U<NativeLoginInitialDestination, Unit> {
    public final /* synthetic */ AuraNavigator $navigator;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(NativeLoginInitialDestination nativeLoginInitialDestination) {
        AuraNavKey auraNavKey;
        C7384Etj.A0Y(nativeLoginInitialDestination, 0);
        AuraNavigator auraNavigator = this.$navigator;
        int iOrdinal = nativeLoginInitialDestination.ordinal();
        if (iOrdinal == 0) {
            auraNavKey = NativeLoginLandingScreenKey.INSTANCE;
        } else {
            if (iOrdinal != 1) {
                throw C3cG.A0q();
            }
            auraNavKey = NativeLoginPhoneEntryScreenKey.INSTANCE;
        }
        auraNavigator.navigate(auraNavKey, true);
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NativeLoginInitialDestination.values().length];
            try {
                AnonymousClass002.A13(NativeLoginInitialDestination.LANDING, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(NativeLoginInitialDestination.PHONE_ENTRY, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginRoutesKt$NativeLoginIntroRoute$2$1(AuraNavigator auraNavigator) {
        super(1);
        this.$navigator = auraNavigator;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(NativeLoginInitialDestination nativeLoginInitialDestination) {
        invoke2(nativeLoginInitialDestination);
        return Unit.INSTANCE;
    }
}
