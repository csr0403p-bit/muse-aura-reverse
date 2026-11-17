package com.facebook.aura.feed.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C1971Avc;
import X.C78g;
import X.G0U;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;

/* loaded from: classes4.dex */
public final class FeedTabScreenKt$FeedTabScreen$7$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ boolean $isDarkTheme;
    public final /* synthetic */ boolean $isEditorRevealed;
    public final /* synthetic */ View $view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedTabScreenKt$FeedTabScreen$7$1(boolean z, View view, boolean z2) {
        super(1);
        this.$isEditorRevealed = z;
        this.$view = view;
        this.$isDarkTheme = z2;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        Activity activity;
        Window window;
        if (!this.$isEditorRevealed) {
            return new C78g() { // from class: com.facebook.aura.feed.view.FeedTabScreenKt$FeedTabScreen$7$1$invoke$$inlined$onDispose$1
                @Override // X.C78g
                public void dispose() {
                }
            };
        }
        Context context = this.$view.getContext();
        final C1971Avc c1971Avc = null;
        if ((context instanceof Activity) && (activity = (Activity) context) != null && (window = activity.getWindow()) != null) {
            c1971Avc = new C1971Avc(window.getDecorView(), window);
            c1971Avc.A01(false);
        }
        final boolean z = this.$isDarkTheme;
        return new C78g() { // from class: com.facebook.aura.feed.view.FeedTabScreenKt$FeedTabScreen$7$1$invoke$$inlined$onDispose$2
            @Override // X.C78g
            public void dispose() {
                C1971Avc c1971Avc2 = c1971Avc;
                if (c1971Avc2 != null) {
                    c1971Avc2.A01(!z);
                }
            }
        };
    }
}
