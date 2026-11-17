package com.facebook.aura.storagerecovery.content;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.AnonymousClass037;
import X.BFM;
import X.C0CD;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G2j;
import com.facebook.aura.storagerecovery.StorageRecoveryUiState;
import com.facebook.aura.storagerecovery.data.HatchStorageRecoveryEntry;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class StorageRecoveryFileListKt$StorageRecoveryEntries$1$1 extends AbstractC7559F3s implements G0U<C0CD, Unit> {
    public final /* synthetic */ G0U<String, Unit> $onEntryTap;
    public final /* synthetic */ StorageRecoveryUiState $uiState;

    /* renamed from: com.facebook.aura.storagerecovery.content.StorageRecoveryFileListKt$StorageRecoveryEntries$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<HatchStorageRecoveryEntry, Object> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Object invoke(HatchStorageRecoveryEntry hatchStorageRecoveryEntry) {
            HatchStorageRecoveryEntry hatchStorageRecoveryEntry2 = hatchStorageRecoveryEntry;
            C7384Etj.A0Y(hatchStorageRecoveryEntry2, 0);
            return hatchStorageRecoveryEntry2.selectionToken;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(HatchStorageRecoveryEntry hatchStorageRecoveryEntry) {
            C7384Etj.A0Y(hatchStorageRecoveryEntry, 0);
            return hatchStorageRecoveryEntry.selectionToken;
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C0CD c0cd) {
        C7384Etj.A0Y(c0cd, 0);
        final StorageRecoveryUiState storageRecoveryUiState = this.$uiState;
        final AHD<HatchStorageRecoveryEntry> ahd = storageRecoveryUiState.entries;
        final AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
        final G0U<String, Unit> g0u = this.$onEntryTap;
        final StorageRecoveryFileListKt$StorageRecoveryEntries$1$1$invoke$$inlined$items$default$1 storageRecoveryFileListKt$StorageRecoveryEntries$1$1$invoke$$inlined$items$default$1 = new G0U() { // from class: com.facebook.aura.storagerecovery.content.StorageRecoveryFileListKt$StorageRecoveryEntries$1$1$invoke$$inlined$items$default$1
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return null;
            }

            @Override // X.G0U
            public final Void invoke(HatchStorageRecoveryEntry hatchStorageRecoveryEntry) {
                return null;
            }
        };
        c0cd.APL(anonymousClass1 != null ? new G0U<Integer, Object>() { // from class: com.facebook.aura.storagerecovery.content.StorageRecoveryFileListKt$StorageRecoveryEntries$1$1$invoke$$inlined$items$default$2
            public final Object invoke(int i) {
                return AnonymousClass006.A0p(ahd, anonymousClass1, i);
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(AnonymousClass001.A0F(num));
            }
        } : null, new G0U<Integer, Object>() { // from class: com.facebook.aura.storagerecovery.content.StorageRecoveryFileListKt$StorageRecoveryEntries$1$1$invoke$$inlined$items$default$3
            public final Object invoke(int i) {
                return AnonymousClass006.A0p(ahd, storageRecoveryFileListKt$StorageRecoveryEntries$1$1$invoke$$inlined$items$default$1, i);
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(AnonymousClass001.A0F(num));
            }
        }, AnonymousClass001.A0M(new G2j<AnonymousClass037, Integer, BFM, Integer, Unit>() { // from class: com.facebook.aura.storagerecovery.content.StorageRecoveryFileListKt$StorageRecoveryEntries$1$1$invoke$$inlined$items$default$4
            public final void invoke(AnonymousClass037 anonymousClass037, int i, BFM bfm, int i2) {
                int iA0d = (i2 & 6) == 0 ? AnonymousClass004.A0d(bfm, anonymousClass037) | i2 : i2;
                if ((i2 & 48) == 0) {
                    iA0d |= AnonymousClass004.A0E(bfm, i);
                }
                if (!AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
                    bfm.Afo();
                    return;
                }
                HatchStorageRecoveryEntry hatchStorageRecoveryEntry = (HatchStorageRecoveryEntry) ahd.get(i);
                bfm.AgE(126564847);
                StorageRecoveryUiState storageRecoveryUiState2 = storageRecoveryUiState;
                boolean z = storageRecoveryUiState2.isSelecting;
                boolean zContains = storageRecoveryUiState2.selectedTokens.contains(hatchStorageRecoveryEntry.selectionToken);
                boolean zIsMutationEnabled = storageRecoveryUiState.isMutationEnabled();
                boolean zA1J = AnonymousClass003.A1J(bfm, g0u, hatchStorageRecoveryEntry);
                Object objAaT = bfm.AaT();
                if (zA1J || objAaT == C78N.A00) {
                    objAaT = new StorageRecoveryFileListKt$StorageRecoveryEntries$1$1$2$1$1(g0u, hatchStorageRecoveryEntry);
                    bfm.Ai0(objAaT);
                }
                StorageRecoveryFileListKt.StorageRecoveryEntryRow(hatchStorageRecoveryEntry, z, zContains, zIsMutationEnabled, (Function0) objAaT, null, bfm, 0, 32);
                AnonymousClass001.A1D(bfm);
            }

            @Override // X.G2j
            public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, Integer num, BFM bfm, Integer num2) {
                invoke(anonymousClass037, AnonymousClass001.A0F(num), bfm, AnonymousClass001.A0F(num2));
                return Unit.INSTANCE;
            }
        }, 802480018), ahd.size());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public StorageRecoveryFileListKt$StorageRecoveryEntries$1$1(StorageRecoveryUiState storageRecoveryUiState, G0U<? super String, Unit> g0u) {
        super(1);
        this.$uiState = storageRecoveryUiState;
        this.$onEntryTap = g0u;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C0CD c0cd) {
        invoke2(c0cd);
        return Unit.INSTANCE;
    }
}
