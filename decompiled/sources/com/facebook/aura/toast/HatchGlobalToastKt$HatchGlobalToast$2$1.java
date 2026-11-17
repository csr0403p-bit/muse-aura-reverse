package com.facebook.aura.toast;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C20Q;
import X.C3UX;
import X.C3pU;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0V;
import X.GDB;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import android.view.View;
import com.facebook.aura.toast.HatchGlobalToastsRegistry;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

@DebugMetadata(c = "com.facebook.aura.toast.HatchGlobalToastKt$HatchGlobalToast$2$1", f = "HatchGlobalToast.kt", l = {R.styleable.maplibre_MapView_maplibre_uiCompassMarginTop}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchGlobalToastKt$HatchGlobalToast$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ Context $appContext;
    public final /* synthetic */ Object $mount;
    public final /* synthetic */ View $parentView;
    public final /* synthetic */ AbstractC3358CGz $userSession;
    public int label;

    @DebugMetadata(c = "com.facebook.aura.toast.HatchGlobalToastKt$HatchGlobalToast$2$1$2", f = "HatchGlobalToast.kt", l = {R.styleable.maplibre_MapView_maplibre_uiHorizontalScrollGestures}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.toast.HatchGlobalToastKt$HatchGlobalToast$2$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<Boolean, HtJ<? super Unit>, Object> {
        public final /* synthetic */ View $parentView;
        public /* synthetic */ boolean Z$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(View view, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$parentView = view;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$parentView, htJ);
            anonymousClass2.Z$0 = AnonymousClass001.A1X(obj);
            return anonymousClass2;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            boolean z = this.Z$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                if (z) {
                    View view = this.$parentView;
                    this.Z$0 = z;
                    this.label = 1;
                    if (HatchGlobalToastKt.collectToasts(view, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, HtJ<? super Unit> htJ) {
            return invoke(AnonymousClass001.A1X(bool), htJ);
        }

        public final Object invoke(boolean z, HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) AnonymousClass002.A0r(htJ, this, z)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchGlobalToastKt$HatchGlobalToast$2$1(AbstractC3358CGz abstractC3358CGz, Context context, Object obj, View view, HtJ<? super HatchGlobalToastKt$HatchGlobalToast$2$1> htJ) {
        super(2, htJ);
        this.$userSession = abstractC3358CGz;
        this.$appContext = context;
        this.$mount = obj;
        this.$parentView = view;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchGlobalToastKt$HatchGlobalToast$2$1(this.$userSession, this.$appContext, this.$mount, this.$parentView, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchGlobalToastsRegistry.Companion companion = HatchGlobalToastsRegistry.Companion;
            AbstractC3358CGz abstractC3358CGz = this.$userSession;
            Context context = this.$appContext;
            C7384Etj.A0X(context);
            C20Q c20qA01 = GDB.A01(new HatchGlobalToastKt$HatchGlobalToast$2$1$invokeSuspend$$inlined$map$1(companion.getInstance(abstractC3358CGz, context).mounts, this.$mount));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$parentView, null);
            this.label = 1;
            if (C3pU.A00(this, anonymousClass2, c20qA01) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchGlobalToastKt$HatchGlobalToast$2$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
