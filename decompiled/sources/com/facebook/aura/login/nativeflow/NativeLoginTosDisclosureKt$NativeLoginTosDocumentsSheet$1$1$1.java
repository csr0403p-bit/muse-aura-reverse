package com.facebook.aura.login.nativeflow;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass006;
import X.C7384Etj;
import X.G0U;
import android.content.Context;
import com.facebook.aura.login.nativeflow.HatchTosGroup;
import com.facebook.aura.ui.HatchSectionScope;
import java.util.Iterator;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class NativeLoginTosDisclosureKt$NativeLoginTosDocumentsSheet$1$1$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ HatchTosGroup.Documents $group;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        AHD<HatchTosDocument> ahd = this.$group.documents;
        Context context = this.$context;
        Iterator it = ahd.iterator();
        while (it.hasNext()) {
            AnonymousClass006.A1E(hatchSectionScope, new NativeLoginTosDisclosureKt$NativeLoginTosDocumentsSheet$1$1$1$1$1((HatchTosDocument) it.next(), context), -1974201404);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginTosDisclosureKt$NativeLoginTosDocumentsSheet$1$1$1(HatchTosGroup.Documents documents, Context context) {
        super(1);
        this.$group = documents;
        this.$context = context;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}
