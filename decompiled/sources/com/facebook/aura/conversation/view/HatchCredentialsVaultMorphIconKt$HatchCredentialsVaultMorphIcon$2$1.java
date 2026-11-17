package com.facebook.aura.conversation.view;

import X.AOW;
import X.AT3;
import X.AT5;
import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import X.InterfaceC1068ATy;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchCredentialsVaultMorphIconKt$HatchCredentialsVaultMorphIcon$2$1 extends AbstractC7559F3s implements G0U<AT3, Unit> {
    public final /* synthetic */ InterfaceC1068ATy $keyPath;
    public final /* synthetic */ InterfaceC1068ATy $outlinePath;
    public final /* synthetic */ AT5<Float, AOW> $progress;
    public final /* synthetic */ long $restColor;
    public final /* synthetic */ long $successColor;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AT3 at3) {
        C7384Etj.A0Y(at3, 0);
        HatchCredentialsVaultMorphIconKt.m590drawVaultMorph9z6LAg8(at3, MutableState.A00(this.$progress), this.$restColor, this.$successColor, this.$outlinePath, this.$keyPath);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchCredentialsVaultMorphIconKt$HatchCredentialsVaultMorphIcon$2$1(AT5<Float, AOW> at5, long j, long j2, InterfaceC1068ATy interfaceC1068ATy, InterfaceC1068ATy interfaceC1068ATy2) {
        super(1);
        this.$progress = at5;
        this.$restColor = j;
        this.$successColor = j2;
        this.$outlinePath = interfaceC1068ATy;
        this.$keyPath = interfaceC1068ATy2;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AT3 at3) {
        invoke2(at3);
        return Unit.INSTANCE;
    }
}
