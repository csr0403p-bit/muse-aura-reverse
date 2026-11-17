package com.facebook.aura.composer.camera;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass000;
import X.C7384Etj;
import X.C7OU;
import X.G0U;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.auth.AuraSessionManager;
import com.facebook.aura.utils.HatchPermissionUtils;
import java.io.File;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class HatchInAppCameraKt$HatchInAppCameraHost$launch$1$1 extends AbstractC7559F3s implements G0U<G0U<? super File, ? extends Unit>, Unit> {
    public final /* synthetic */ boolean $available;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C7OU<String, Boolean> $permission;
    public final /* synthetic */ MutableState<G0U<File, Unit>> $receiver$delegate;
    public final /* synthetic */ AbstractC3358CGz $session;
    public final /* synthetic */ MutableState<Boolean> $visible$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(G0U<? super File, Unit> g0u) {
        C7384Etj.A0Y(g0u, 0);
        if (this.$available && this.$receiver$delegate.getValue() == null && AuraSessionManager.INSTANCE.isCurrentSession(this.$session)) {
            this.$receiver$delegate.Af8(g0u);
            HatchPermissionUtils hatchPermissionUtils = HatchPermissionUtils.INSTANCE;
            Context context = this.$context;
            String strA00 = AnonymousClass000.A00(27);
            if (hatchPermissionUtils.hasPermission(context, strA00)) {
                MutableState.A09(true, this.$visible$delegate);
            } else {
                A02(strA00);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchInAppCameraKt$HatchInAppCameraHost$launch$1$1(boolean z, AbstractC3358CGz abstractC3358CGz, Context context, C7OU<String, Boolean> c7ou, MutableState<G0U<File, Unit>> mutableState, MutableState<Boolean> mutableState2) {
        super(1);
        this.$available = z;
        this.$session = abstractC3358CGz;
        this.$context = context;
        this.$permission = c7ou;
        this.$receiver$delegate = mutableState;
        this.$visible$delegate = mutableState2;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(G0U<? super File, ? extends Unit> g0u) {
        invoke2((G0U<? super File, Unit>) g0u);
        return Unit.INSTANCE;
    }
}
