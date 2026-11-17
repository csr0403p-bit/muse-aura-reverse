package com.facebook.aura.shortcut;

import X.HtJ;
import X.HxE;
import X.HzP;
import android.net.Uri;
import com.facebook.aura.model.AiIdentity;
import com.facebook.aura.shortcut.HomeScreenShortcutSyncKt$HomeScreenShortcutSync$1$1;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.shortcut.HomeScreenShortcutSyncKt$HomeScreenShortcutSync$1$1$4", f = "HomeScreenShortcutSync.kt", l = {72, 75}, m = "emit", v = 2)
/* loaded from: classes2.dex */
public final class HomeScreenShortcutSyncKt$HomeScreenShortcutSync$1$1$4$emit$1 extends HzP {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HomeScreenShortcutSyncKt$HomeScreenShortcutSync$1$1.AnonymousClass4<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HomeScreenShortcutSyncKt$HomeScreenShortcutSync$1$1$4$emit$1(HomeScreenShortcutSyncKt$HomeScreenShortcutSync$1$1.AnonymousClass4<? super T> anonymousClass4, HtJ<? super HomeScreenShortcutSyncKt$HomeScreenShortcutSync$1$1$4$emit$1> htJ) {
        super(htJ);
        this.this$0 = anonymousClass4;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((HxE<AiIdentity, ? extends Uri>) null, (HtJ<? super Unit>) this);
    }
}
