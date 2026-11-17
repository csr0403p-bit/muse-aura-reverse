package com.facebook.aura.assist;

import X.AbstractC7559F3s;
import com.facebook.aura.header.api.AvatarTakeover;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class AssistSessionIdentityKt$AssistSessionIdentityPill$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Object $owner;
    public final /* synthetic */ AssistIdentityState $state;
    public final /* synthetic */ AvatarTakeover $takeover;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssistSessionIdentityKt$AssistSessionIdentityPill$1$1(AvatarTakeover avatarTakeover, Object obj, AssistIdentityState assistIdentityState) {
        super(0);
        this.$takeover = avatarTakeover;
        this.$owner = obj;
        this.$state = assistIdentityState;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke2() {
        /*
            r4 = this;
            com.facebook.aura.header.api.AvatarTakeover r3 = r4.$takeover
            if (r3 == 0) goto L1b
            java.lang.Object r2 = r4.$owner
            com.facebook.aura.assist.AssistIdentityState r0 = r4.$state
            boolean r0 = r0.isVisible()
            if (r0 == 0) goto L17
            com.facebook.aura.header.api.AvatarTakeover r0 = r4.$takeover
            boolean r1 = r0.isEngaged()
            r0 = 1
            if (r1 != 0) goto L18
        L17:
            r0 = 0
        L18:
            r3.updateVisibility(r2, r0)
        L1b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.assist.AssistSessionIdentityKt$AssistSessionIdentityPill$1$1.invoke2():void");
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
