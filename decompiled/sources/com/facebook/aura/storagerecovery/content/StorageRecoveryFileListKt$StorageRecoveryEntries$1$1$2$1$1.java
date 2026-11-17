package com.facebook.aura.storagerecovery.content;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.storagerecovery.data.HatchStorageRecoveryEntry;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class StorageRecoveryFileListKt$StorageRecoveryEntries$1$1$2$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchStorageRecoveryEntry $entry;
    public final /* synthetic */ G0U<String, Unit> $onEntryTap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public StorageRecoveryFileListKt$StorageRecoveryEntries$1$1$2$1$1(G0U<? super String, Unit> g0u, HatchStorageRecoveryEntry hatchStorageRecoveryEntry) {
        super(0);
        this.$onEntryTap = g0u;
        this.$entry = hatchStorageRecoveryEntry;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onEntryTap.invoke(this.$entry.selectionToken);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
