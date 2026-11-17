package com.facebook.aura.login.nativeflow;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.BFM;
import X.BRg;
import X.C1Cd;
import X.C3U4;
import X.G0W;
import android.content.res.Resources;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchImpressionModifierKt;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class NativeLoginPhoneEntryScreenKt$NativeLoginPhoneEntryScreen$3$1$2 extends AbstractC7559F3s implements G0W<C1Cd, BFM, Integer, Unit> {
    public final /* synthetic */ boolean $isLoading;
    public final /* synthetic */ boolean $isSigningInWithGoogle;
    public final /* synthetic */ Function0<Unit> $onGoogleSignInClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginPhoneEntryScreenKt$NativeLoginPhoneEntryScreen$3$1$2(boolean z, Function0<Unit> function0, boolean z2) {
        super(3);
        this.$isLoading = z;
        this.$onGoogleSignInClick = function0;
        this.$isSigningInWithGoogle = z2;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C1Cd c1Cd, BFM bfm, Integer num) throws XmlPullParserException, Resources.NotFoundException, IOException {
        invoke(c1Cd, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(C1Cd c1Cd, BFM bfm, int i) throws XmlPullParserException, Resources.NotFoundException, IOException {
        if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, c1Cd), bfm, i)) {
            NativeLoginGoogleSignInButtonKt.NativeLoginGoogleSignInButton(this.$onGoogleSignInClick, HatchImpressionModifierKt.hatchImpression(C3U4.A0C(BRg.A00, 0.0f, AuraDimensKt.SpacingSmall, 0.0f, AuraDimensKt.SpacingXlarge), HatchOrigin.ONBOARDING, HatchSurface.ONBOARDING, HatchSubsurface.ONBOARDING_PRE_AUTH, HatchScreen.LOGIN_CONTACT_POINT, HatchComponent.GOOGLE_SIGN_IN_BUTTON, null, null, null, 500L, 0.0f, null, null, null), !this.$isLoading, this.$isSigningInWithGoogle, bfm, 0, 0);
            return;
        }
        bfm.Afo();
    }
}
