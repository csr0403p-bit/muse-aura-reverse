package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.library.model.RecentFile;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class RecentSectionKt$RecentSection$2$1$1$2$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ RecentFile $file;
    public final /* synthetic */ G0U<RecentFile, Unit> $onRecentItemClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RecentSectionKt$RecentSection$2$1$1$2$2$1(G0U<? super RecentFile, Unit> g0u, RecentFile recentFile) {
        super(0);
        this.$onRecentItemClick = g0u;
        this.$file = recentFile;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onRecentItemClick.invoke(this.$file);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
