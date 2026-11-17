package com.facebook.aura.conversation.widget.api;

import X.AnonymousClass005;
import X.C06H;
import X.C1D3;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ConversationCardControls {
    public static final int $stable = 0;
    public final long backgroundColor;
    public final C1D3 containerShape;
    public final boolean isEnabled;
    public final Function0<Unit> onAccept;
    public final Function0<Unit> onDecline;

    public ConversationCardControls(boolean z, long j, C1D3 c1d3, Function0<Unit> function0, Function0<Unit> function02) {
        AnonymousClass005.A12(c1d3, function0, function02, 2);
        this.isEnabled = z;
        this.backgroundColor = j;
        this.containerShape = c1d3;
        this.onAccept = function0;
        this.onDecline = function02;
    }

    /* renamed from: getBackgroundColor-0d7_KjU, reason: not valid java name */
    public final long m712getBackgroundColor0d7_KjU() {
        return this.backgroundColor;
    }

    public final C1D3 getContainerShape() {
        return this.containerShape;
    }

    public final Function0<Unit> getOnAccept() {
        return this.onAccept;
    }

    public final Function0<Unit> getOnDecline() {
        return this.onDecline;
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public /* synthetic */ ConversationCardControls(boolean z, long j, C1D3 c1d3, Function0 function0, Function0 function02, C06H c06h) {
        this(z, j, c1d3, function0, function02);
    }
}
