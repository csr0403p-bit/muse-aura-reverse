package com.facebook.aura.assist;

import X.A6I;
import X.A6O;
import X.AbstractC1720Ap8;
import X.AbstractC3358CGz;
import X.AnonymousClass005;
import X.B1U;
import X.BJt;
import X.BOD;
import X.C3cH;
import X.C5303Dfm;
import X.C7384Etj;
import X.EnumC10573Huf;
import X.F2N;
import android.content.Context;
import android.graphics.Rect;
import androidx.compose.ui.platform.ComposeView;
import androidx.savedstate.SavedStateRegistry;
import com.facebook.aura.R;
import com.facebook.aura.lifecycle.AuraAppLifecycleManager;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolder;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class AssistIdentityHost implements BOD, A6I {
    public static final int $stable = 8;
    public final VoiceCallStateHolder callHolder;
    public final C5303Dfm lifecycle;
    public final Function0<Unit> onCallEnded;
    public final Function0<Unit> onCollapsed;
    public final Function0<Unit> onRestore;
    public final A6O savedStateController;
    public final SavedStateRegistry savedStateRegistry;
    public final AssistIdentityState state;
    public final long token;
    public final Rect touchableBounds;
    public final AbstractC3358CGz userSession;
    public ComposeView view;
    public final BJt viewModelStore;

    public AssistIdentityHost(long j, AssistIdentityState assistIdentityState, AbstractC3358CGz abstractC3358CGz, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03) {
        C7384Etj.A0Y(assistIdentityState, 1);
        AnonymousClass005.A16(abstractC3358CGz, function0, function02, function03, 2);
        this.token = j;
        this.state = assistIdentityState;
        this.userSession = abstractC3358CGz;
        this.onRestore = function0;
        this.onCollapsed = function02;
        this.onCallEnded = function03;
        this.lifecycle = new C5303Dfm(this, true);
        this.viewModelStore = new BJt();
        A6O a6oA00 = A6O.A00(this);
        this.savedStateController = a6oA00;
        this.savedStateRegistry = a6oA00.A00;
        VoiceCallStateHolder companion = VoiceCallStateHolder.Companion.getInstance(abstractC3358CGz);
        this.callHolder = companion;
        this.touchableBounds = new Rect();
        a6oA00.A01.A00();
        a6oA00.A01(null);
        this.lifecycle.A07(EnumC10573Huf.A02);
        companion.registerCompactPresentation(this);
    }

    public final ComposeView createView(Context context) {
        C7384Etj.A0Y(context, 0);
        ComposeView composeView = this.view;
        if (composeView != null) {
            return composeView;
        }
        ComposeView composeView2 = new ComposeView(context);
        this.view = composeView2;
        AbstractC1720Ap8.A01(composeView2, this);
        composeView2.setTag(R.id.view_tree_view_model_store_owner, this);
        composeView2.setTag(R.id.view_tree_saved_state_registry_owner, this);
        composeView2.setContent(B1U.A03(new AssistIdentityHost$createView$2$1(this, composeView2), 1268062971, true));
        this.lifecycle.A07(EnumC10573Huf.A05);
        AuraAppLifecycleManager.INSTANCE.markWindowSurfaceVisible(this, true);
        return composeView2;
    }

    public final void dispose() {
        AuraAppLifecycleManager.INSTANCE.markWindowSurfaceVisible(this, false);
        this.lifecycle.A07(EnumC10573Huf.A03);
        ComposeView composeView = this.view;
        if (composeView != null) {
            composeView.A0C();
        }
        this.view = null;
        this.viewModelStore.A00();
        this.touchableBounds.setEmpty();
        this.callHolder.unregisterCompactPresentation(this);
    }

    @Override // X.C1HY
    public C5303Dfm getLifecycle() {
        return this.lifecycle;
    }

    @Override // X.A6I
    public SavedStateRegistry getSavedStateRegistry() {
        return this.savedStateRegistry;
    }

    public final AssistIdentityState getState() {
        return this.state;
    }

    public final long getToken() {
        return this.token;
    }

    public final Rect getTouchableBounds() {
        return this.touchableBounds;
    }

    @Override // X.BOD
    public BJt getViewModelStore() {
        return this.viewModelStore;
    }

    public final boolean isCallActive() {
        return C3cH.A1P(this.callHolder);
    }

    @Override // X.C1HY
    public /* bridge */ /* synthetic */ F2N getLifecycle() {
        return this.lifecycle;
    }
}
