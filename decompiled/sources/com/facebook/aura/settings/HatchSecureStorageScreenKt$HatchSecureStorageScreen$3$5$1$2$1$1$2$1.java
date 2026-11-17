package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.settings.SecureStorageCatalogRow;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchSecureStorageScreenKt$HatchSecureStorageScreen$3$5$1$2$1$1$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ G0U<CustomConnectorCandidate, Unit> $onCustomConnectorClick;
    public final /* synthetic */ SecureStorageCatalogRow $row;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchSecureStorageScreenKt$HatchSecureStorageScreen$3$5$1$2$1$1$2$1(G0U<? super CustomConnectorCandidate, Unit> g0u, SecureStorageCatalogRow secureStorageCatalogRow) {
        super(0);
        this.$onCustomConnectorClick = g0u;
        this.$row = secureStorageCatalogRow;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        SecureStorageLogging.INSTANCE.customConnectorRowTapped();
        this.$onCustomConnectorClick.invoke(((SecureStorageCatalogRow.CustomConnector) this.$row).connector);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
