package com.facebook.aura.agentpermission;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C3UX;
import X.C4Ax;
import X.C78T;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.agentpermission.PhoneNotificationsAccessControlsKt$PhoneNotificationsAccessAppRow$1$1", f = "PhoneNotificationsAccessControls.kt", l = {207}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class PhoneNotificationsAccessControlsKt$PhoneNotificationsAccessAppRow$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C4Ax $app;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ MutableState<Drawable> $icon$delegate;
    public int label;

    @DebugMetadata(c = "com.facebook.aura.agentpermission.PhoneNotificationsAccessControlsKt$PhoneNotificationsAccessAppRow$1$1$1", f = "PhoneNotificationsAccessControls.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.agentpermission.PhoneNotificationsAccessControlsKt$PhoneNotificationsAccessAppRow$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ C4Ax $app;
        public final /* synthetic */ Context $context;
        public final /* synthetic */ MutableState<Drawable> $icon$delegate;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context, C4Ax c4Ax, MutableState<Drawable> mutableState, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$context = context;
            this.$app = c4Ax;
            this.$icon$delegate = mutableState;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$context, this.$app, this.$icon$delegate, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            try {
                this.$icon$delegate.Af8(this.$context.getPackageManager().getApplicationIcon(this.$app.A01));
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhoneNotificationsAccessControlsKt$PhoneNotificationsAccessAppRow$1$1(Context context, C4Ax c4Ax, MutableState<Drawable> mutableState, HtJ<? super PhoneNotificationsAccessControlsKt$PhoneNotificationsAccessAppRow$1$1> htJ) {
        super(2, htJ);
        this.$context = context;
        this.$app = c4Ax;
        this.$icon$delegate = mutableState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new PhoneNotificationsAccessControlsKt$PhoneNotificationsAccessAppRow$1$1(this.$context, this.$app, this.$icon$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            C78T c78tA0s = AnonymousClass002.A0s(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$context, this.$app, this.$icon$delegate, null);
            this.label = 1;
            if (GAo.A00(this, c78tA0s, anonymousClass1) == enumC10460Hji) {
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
        return ((PhoneNotificationsAccessControlsKt$PhoneNotificationsAccessAppRow$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
