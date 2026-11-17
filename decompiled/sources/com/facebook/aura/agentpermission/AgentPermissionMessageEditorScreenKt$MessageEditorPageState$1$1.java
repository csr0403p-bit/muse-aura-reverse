package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import X.C0Hi;
import X.C0Yr;
import X.C1C3;
import X.C78g;
import X.G0U;

/* loaded from: classes2.dex */
public final class AgentPermissionMessageEditorScreenKt$MessageEditorPageState$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ C0Hi $focusManager;
    public final /* synthetic */ C1C3 $keyboardController;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgentPermissionMessageEditorScreenKt$MessageEditorPageState$1$1(C0Hi c0Hi, C1C3 c1c3) {
        super(1);
        this.$focusManager = c0Hi;
        this.$keyboardController = c1c3;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        this.$focusManager.A6G(false);
        C1C3 c1c3 = this.$keyboardController;
        if (c1c3 != null) {
            c1c3.hide();
        }
        return new C78g() { // from class: com.facebook.aura.agentpermission.AgentPermissionMessageEditorScreenKt$MessageEditorPageState$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
