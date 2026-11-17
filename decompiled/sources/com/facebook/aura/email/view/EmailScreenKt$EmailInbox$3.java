package com.facebook.aura.email.view;

import X.AbstractC07539Wl;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.BFM;
import X.BRg;
import X.C10G;
import X.C1DP;
import X.C1YY;
import X.C78N;
import X.G0U;
import X.G0W;
import X.InterfaceC05151eP;
import androidx.compose.foundation.lazy.LazyListState;
import com.facebook.aura.email.viewmodel.EmailInboxSessionViewModel;
import com.facebook.aura.email.viewmodel.EmailState;
import com.facebook.aura.email.viewmodel.EmailViewModel;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class EmailScreenKt$EmailInbox$3 extends AbstractC7559F3s implements G0W<InterfaceC05151eP, BFM, Integer, Unit> {
    public final /* synthetic */ float $bottomPadding;
    public final /* synthetic */ String $environmentId;
    public final /* synthetic */ EmailInboxSessionViewModel $inboxSession;
    public final /* synthetic */ LazyListState $listState;
    public final /* synthetic */ EmailViewModel $model;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ EmailState $state;
    public final /* synthetic */ float $topPadding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailScreenKt$EmailInbox$3(float f, float f2, LazyListState lazyListState, EmailState emailState, EmailInboxSessionViewModel emailInboxSessionViewModel, AuraNavigator auraNavigator, String str, EmailViewModel emailViewModel) {
        super(3);
        this.$topPadding = f;
        this.$bottomPadding = f2;
        this.$listState = lazyListState;
        this.$state = emailState;
        this.$inboxSession = emailInboxSessionViewModel;
        this.$navigator = auraNavigator;
        this.$environmentId = str;
        this.$model = emailViewModel;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, Integer num) {
        invoke(interfaceC05151eP, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, interfaceC05151eP), bfm, i)) {
            C1DP c1dp = new C1DP(0.0f, this.$topPadding, 0.0f, this.$bottomPadding + 24.0f);
            BRg bRgA00 = AbstractC07539Wl.A00(C10G.A01, "email-inbox");
            LazyListState lazyListState = this.$listState;
            boolean zA1T = AnonymousClass001.A1T(bfm, this.$model, AnonymousClass001.A1R(bfm, this.$environmentId, AnonymousClass001.A1T(bfm, this.$navigator, AnonymousClass001.A1T(bfm, this.$inboxSession, bfm.A67(this.$state)))));
            EmailState emailState = this.$state;
            EmailInboxSessionViewModel emailInboxSessionViewModel = this.$inboxSession;
            AuraNavigator auraNavigator = this.$navigator;
            String str = this.$environmentId;
            EmailViewModel emailViewModel = this.$model;
            Object objAaT = bfm.AaT();
            if (zA1T || objAaT == C78N.A00) {
                objAaT = new EmailScreenKt$EmailInbox$3$1$1(emailState, emailInboxSessionViewModel, auraNavigator, str, emailViewModel);
                bfm.Ai0(objAaT);
            }
            C1YY.A01(null, null, null, c1dp, lazyListState, bfm, null, bRgA00, (G0U) objAaT, 6, 504, false, false);
            return;
        }
        bfm.Afo();
    }
}
