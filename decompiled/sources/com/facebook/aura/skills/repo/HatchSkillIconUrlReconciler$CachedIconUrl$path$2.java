package com.facebook.aura.skills.repo;

import X.AbstractC7559F3s;
import com.facebook.aura.skills.repo.HatchSkillIconUrlReconciler;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchSkillIconUrlReconciler$CachedIconUrl$path$2 extends AbstractC7559F3s implements Function0<String> {
    public final /* synthetic */ String $precomputedPath;
    public final /* synthetic */ HatchSkillIconUrlReconciler.CachedIconUrl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSkillIconUrlReconciler$CachedIconUrl$path$2(String str, HatchSkillIconUrlReconciler.CachedIconUrl cachedIconUrl) {
        super(0);
        this.$precomputedPath = str;
        this.this$0 = cachedIconUrl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        String str = this.$precomputedPath;
        return str == null ? HatchSkillIconUrlReconcilerKt.extractPath(this.this$0.iconUrl) : str;
    }
}
