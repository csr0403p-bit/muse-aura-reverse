package com.facebook.aura.inappnotification;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C20Z;
import X.C22I;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.inappnotification.api.InAppNotification;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.inappnotification.HatchInAppNotificationHostKt$HatchInAppNotificationHost$1$1", f = "HatchInAppNotificationHost.kt", l = {72}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchInAppNotificationHostKt$HatchInAppNotificationHost$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ MutableState<InAppNotification.NotificationArgs> $currentNotification$delegate;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ MutableState<Boolean> $visible$delegate;
    public int label;

    /* renamed from: com.facebook.aura.inappnotification.HatchInAppNotificationHostKt$HatchInAppNotificationHost$1$1$1, reason: invalid class name */
    public final class AnonymousClass1<T> implements C20Z {
        public final /* synthetic */ MutableState<InAppNotification.NotificationArgs> $currentNotification$delegate;
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ MutableState<Boolean> $visible$delegate;

        public AnonymousClass1(AuraNavigator auraNavigator, MutableState<InAppNotification.NotificationArgs> mutableState, MutableState<Boolean> mutableState2) {
            this.$navigator = auraNavigator;
            this.$currentNotification$delegate = mutableState;
            this.$visible$delegate = mutableState2;
        }

        @Override // X.C20Z
        public /* bridge */ /* synthetic */ Object emit(Object obj, HtJ htJ) {
            return emit((InAppNotification.NotificationArgs) obj, (HtJ<? super Unit>) htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(com.facebook.aura.inappnotification.api.InAppNotification.NotificationArgs r7, X.HtJ<? super kotlin.Unit> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof com.facebook.aura.inappnotification.HatchInAppNotificationHostKt$HatchInAppNotificationHost$1$1$1$emit$1
                if (r0 == 0) goto L76
                r3 = r8
                com.facebook.aura.inappnotification.HatchInAppNotificationHostKt$HatchInAppNotificationHost$1$1$1$emit$1 r3 = (com.facebook.aura.inappnotification.HatchInAppNotificationHostKt$HatchInAppNotificationHost$1$1$1$emit$1) r3
                int r2 = r3.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r2 & r1
                if (r0 == 0) goto L76
                int r2 = r2 - r1
                r3.label = r2
            L12:
                java.lang.Object r1 = r3.result
                X.Hji r2 = X.EnumC10460Hji.A02
                int r0 = r3.label
                r5 = 2
                r4 = 1
                if (r0 == 0) goto L3a
                if (r0 == r4) goto L5e
                if (r0 != r5) goto L7c
                java.lang.Object r7 = r3.L$0
                X.Hwg.A00(r1)
            L25:
                androidx.compose.runtime.MutableState<com.facebook.aura.inappnotification.api.InAppNotification$NotificationArgs> r0 = r6.$currentNotification$delegate
                java.lang.Object r0 = r0.getValue()
                boolean r0 = X.C7384Etj.areEqual(r0, r7)
                if (r0 == 0) goto L37
                androidx.compose.runtime.MutableState<com.facebook.aura.inappnotification.api.InAppNotification$NotificationArgs> r1 = r6.$currentNotification$delegate
                r0 = 0
                r1.Af8(r0)
            L37:
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                return r2
            L3a:
                X.Hwg.A00(r1)
                com.facebook.aura.navigation.AuraNavigator r0 = r6.$navigator
                boolean r0 = com.facebook.aura.inappnotification.HatchInAppNotificationHostKt.isSuppressed(r7, r0)
                if (r0 != 0) goto L37
                androidx.compose.runtime.MutableState<com.facebook.aura.inappnotification.api.InAppNotification$NotificationArgs> r0 = r6.$currentNotification$delegate
                r0.Af8(r7)
                androidx.compose.runtime.MutableState<java.lang.Boolean> r0 = r6.$visible$delegate
                androidx.compose.runtime.MutableState.A09(r4, r0)
                long r0 = com.facebook.aura.inappnotification.HatchInAppNotificationHostKt.displayDurationMillis(r7)
                r3.L$0 = r7
                r3.label = r4
                java.lang.Object r0 = X.C7Bq.A01(r0, r3)
                if (r0 != r2) goto L63
                return r2
            L5e:
                java.lang.Object r7 = r3.L$0
                X.Hwg.A00(r1)
            L63:
                androidx.compose.runtime.MutableState<java.lang.Boolean> r1 = r6.$visible$delegate
                r0 = 0
                androidx.compose.runtime.MutableState.A09(r0, r1)
                r3.L$0 = r7
                r3.label = r5
                r0 = 160(0xa0, double:7.9E-322)
                java.lang.Object r0 = X.C7Bq.A01(r0, r3)
                if (r0 != r2) goto L25
                return r2
            L76:
                com.facebook.aura.inappnotification.HatchInAppNotificationHostKt$HatchInAppNotificationHost$1$1$1$emit$1 r3 = new com.facebook.aura.inappnotification.HatchInAppNotificationHostKt$HatchInAppNotificationHost$1$1$1$emit$1
                r3.<init>(r6, r8)
                goto L12
            L7c:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.inappnotification.HatchInAppNotificationHostKt$HatchInAppNotificationHost$1$1.AnonymousClass1.emit(com.facebook.aura.inappnotification.api.InAppNotification$NotificationArgs, X.HtJ):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchInAppNotificationHostKt$HatchInAppNotificationHost$1$1(AuraNavigator auraNavigator, MutableState<InAppNotification.NotificationArgs> mutableState, MutableState<Boolean> mutableState2, HtJ<? super HatchInAppNotificationHostKt$HatchInAppNotificationHost$1$1> htJ) {
        super(2, htJ);
        this.$navigator = auraNavigator;
        this.$currentNotification$delegate = mutableState;
        this.$visible$delegate = mutableState2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchInAppNotificationHostKt$HatchInAppNotificationHost$1$1(this.$navigator, this.$currentNotification$delegate, this.$visible$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C22I<InAppNotification.NotificationArgs> c22i = InAppNotification.notifications;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$navigator, this.$currentNotification$delegate, this.$visible$delegate);
            this.label = 1;
            if (c22i.collect(anonymousClass1, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        throw new KotlinNothingValueException();
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchInAppNotificationHostKt$HatchInAppNotificationHost$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
