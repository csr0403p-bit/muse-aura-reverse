package com.facebook.aura.assist;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;

/* loaded from: classes2.dex */
public final class AssistCameraHostKt$AssistCameraHost$1$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ boolean $active;
    public final /* synthetic */ AssistIdentityState $identity;
    public final /* synthetic */ Object $owner;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssistCameraHostKt$AssistCameraHost$1$1$1(AssistIdentityState assistIdentityState, Object obj, boolean z) {
        super(1);
        this.$identity = assistIdentityState;
        this.$owner = obj;
        this.$active = z;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        this.$identity.setCameraVisible(this.$owner, this.$active);
        final AssistIdentityState assistIdentityState = this.$identity;
        final Object obj = this.$owner;
        return new C78g() { // from class: com.facebook.aura.assist.AssistCameraHostKt$AssistCameraHost$1$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                assistIdentityState.setCameraVisible(obj, false);
            }
        };
    }
}
