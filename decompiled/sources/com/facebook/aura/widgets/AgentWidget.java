package com.facebook.aura.widgets;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C0881AGi;
import X.C3cG;
import X.C6O2;
import X.C7384Etj;
import X.G0U;
import X.HtJ;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.glance.appwidget.GlanceAppWidget;
import java.io.File;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes3.dex */
public abstract class AgentWidget implements HomeScreenWidget {
    public static final int $stable = AgentWidgetStore.$stable;
    public final String key;
    public final AgentWidgetStore store;

    /* renamed from: com.facebook.aura.widgets.AgentWidget$clear$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<C6O2, Unit> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(C6O2 c6o2) {
            C6O2.A00(c6o2);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(C6O2 c6o2) {
            C6O2.A00(c6o2);
        }
    }

    @Override // com.facebook.aura.widgets.HomeScreenWidget
    public void cancelWork(Context context) {
        C7384Etj.A0Y(context, 0);
        AgentWidgetRefreshWorker.Companion.cancel$fbandroid_express_aura_java_com_facebook_aura_widgets_widgets(context, this);
    }

    public abstract Object decodeAvatar(Context context, File file, HtJ<? super Bitmap> htJ);

    @Override // com.facebook.aura.widgets.HomeScreenWidget
    public void deleteFiles(Context context) {
        C7384Etj.A0Y(context, 0);
        this.store.deleteAllAvatars(context);
    }

    public abstract GlanceAppWidget newGlanceWidget();

    /* renamed from: com.facebook.aura.widgets.AgentWidget$showSignedOut$2, reason: invalid class name and case insensitive filesystem */
    public final class C143702 extends AbstractC7559F3s implements G0U<C6O2, Unit> {
        public static final C143702 INSTANCE = new C143702();

        public C143702() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(C6O2 c6o2) {
            C6O2.A00(c6o2);
            c6o2.A08(AgentWidgetStore.SIGNED_OUT, AnonymousClass001.A0i());
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(C6O2 c6o2) {
            invoke2(c6o2);
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ Object clear$suspendImpl(AgentWidget agentWidget, Context context, HtJ<? super Unit> htJ) {
        return C3cG.A0U(agentWidget.store.editAll(context, AnonymousClass2.INSTANCE, htJ));
    }

    public static /* synthetic */ Object refreshIfStale$suspendImpl(AgentWidget agentWidget, Context context, long j, HtJ<? super Unit> htJ) {
        return C3cG.A0U(AgentWidgetRefresher.INSTANCE.refresh(context, agentWidget, htJ));
    }

    public static /* synthetic */ Object showSignedOut$suspendImpl(AgentWidget agentWidget, Context context, HtJ<? super Unit> htJ) {
        return C3cG.A0U(agentWidget.store.editAll(context, C143702.INSTANCE, htJ));
    }

    @Override // com.facebook.aura.widgets.HomeScreenWidget
    public String getKey() {
        return this.key;
    }

    public final AgentWidgetStore getStore() {
        return this.store;
    }

    @Override // com.facebook.aura.widgets.HomeScreenWidget
    public /* bridge */ boolean isAvailable() {
        return true;
    }

    public boolean isCallSupported(AbstractC3358CGz abstractC3358CGz) {
        return false;
    }

    @Override // com.facebook.aura.widgets.HomeScreenWidget
    public Object reconcile(Context context, String str, boolean z, HtJ<? super Unit> htJ) {
        return C3cG.A0U(AgentWidgetRefresher.INSTANCE.refresh(context, this, htJ));
    }

    public List<String> tabIds(AbstractC3358CGz abstractC3358CGz) {
        return C0881AGi.A00;
    }

    public AgentWidget(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.key = str;
        this.store = new AgentWidgetStore(str2, new AgentWidget$store$1(this));
    }

    @Override // com.facebook.aura.widgets.HomeScreenWidget
    public Object clear(Context context, HtJ<? super Unit> htJ) {
        return clear$suspendImpl(this, context, htJ);
    }

    @Override // com.facebook.aura.widgets.HomeScreenWidget
    public /* bridge */ List<Class<?>> getComponents() {
        return Collections.singletonList(getReceiver());
    }

    @Override // com.facebook.aura.widgets.HomeScreenWidget
    public Object refreshIfStale(Context context, long j, HtJ<? super Unit> htJ) {
        return refreshIfStale$suspendImpl(this, context, j, htJ);
    }

    @Override // com.facebook.aura.widgets.HomeScreenWidget
    public Object showSignedOut(Context context, HtJ<? super Unit> htJ) {
        return showSignedOut$suspendImpl(this, context, htJ);
    }
}
