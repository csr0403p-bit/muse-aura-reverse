package com.facebook.aura.skills.view;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.skills.repo.TaskWebsitePermission;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class TaskWebsiteSectionsKt$TaskWebsiteSections$2$1$1$1$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ G0U<String, Unit> $onRevoke;
    public final /* synthetic */ TaskWebsitePermission $website;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TaskWebsiteSectionsKt$TaskWebsiteSections$2$1$1$1$1$1$1(G0U<? super String, Unit> g0u, TaskWebsitePermission taskWebsitePermission) {
        super(0);
        this.$onRevoke = g0u;
        this.$website = taskWebsitePermission;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onRevoke.invoke(this.$website.id);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
