package com.facebook.aura.conversation.view;

import X.AOe;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.B1V;
import X.BFM;
import X.C07C;
import X.C78N;
import X.G0V;
import X.G0W;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.model.InternalLinkActionCardPresentation;
import com.facebook.aura.onepassword.OnePasswordHandoff;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchCredentialsVaultCardKt$HatchCredentialsVaultCard$2 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
    public final /* synthetic */ InternalLinkActionCardPresentation $card;
    public final /* synthetic */ String $passwordPageUrl;
    public final /* synthetic */ SavedCredential $saved;
    public final /* synthetic */ MutableState<Boolean> $sawUnsaved$delegate;
    public final /* synthetic */ AOe<Float> $settleSpec;
    public final /* synthetic */ boolean $settled;
    public final /* synthetic */ String $sourceSessionId;

    /* renamed from: com.facebook.aura.conversation.view.HatchCredentialsVaultCardKt$HatchCredentialsVaultCard$2$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ InternalLinkActionCardPresentation $card;
        public final /* synthetic */ MutableState<Boolean> $sawUnsaved$delegate;
        public final /* synthetic */ AOe<Float> $settleSpec;
        public final /* synthetic */ boolean $settled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InternalLinkActionCardPresentation internalLinkActionCardPresentation, boolean z, AOe<Float> aOe, MutableState<Boolean> mutableState) {
            super(2);
            this.$card = internalLinkActionCardPresentation;
            this.$settled = z;
            this.$settleSpec = aOe;
            this.$sawUnsaved$delegate = mutableState;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                HatchCredentialsVaultCardKt.CredentialsVaultIcon(this.$card.imageUrl, this.$settled, MutableState.A0A((MutableState) this.$sawUnsaved$delegate), this.$settleSpec, null, bfm, 0, 16);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchCredentialsVaultCardKt$HatchCredentialsVaultCard$2$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ InternalLinkActionCardPresentation $card;
        public final /* synthetic */ String $passwordPageUrl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(InternalLinkActionCardPresentation internalLinkActionCardPresentation, String str) {
            super(2);
            this.$card = internalLinkActionCardPresentation;
            this.$passwordPageUrl = str;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                String strCredentialsVaultSubtitle = HatchCredentialsVaultCardKt.credentialsVaultSubtitle(this.$card, this.$passwordPageUrl, bfm, InternalLinkActionCardPresentation.$stable);
                if (strCredentialsVaultSubtitle == null) {
                    bfm.AgE(657662200);
                } else {
                    bfm.AgE(657662201);
                    HatchInternalLinkActionCardKt.InternalLinkCardSubtitleText(strCredentialsVaultSubtitle, null, bfm, 0, 2);
                }
                AnonymousClass001.A1D(bfm);
                return;
            }
            bfm.Afo();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchCredentialsVaultCardKt$HatchCredentialsVaultCard$2(InternalLinkActionCardPresentation internalLinkActionCardPresentation, String str, boolean z, String str2, SavedCredential savedCredential, AOe<Float> aOe, MutableState<Boolean> mutableState) {
        super(3);
        this.$card = internalLinkActionCardPresentation;
        this.$passwordPageUrl = str;
        this.$settled = z;
        this.$sourceSessionId = str2;
        this.$saved = savedCredential;
        this.$settleSpec = aOe;
        this.$sawUnsaved$delegate = mutableState;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
        invoke(c07c, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(C07C c07c, BFM bfm, int i) {
        boolean z = false;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            InternalLinkActionCardPresentation internalLinkActionCardPresentation = this.$card;
            String str = this.$passwordPageUrl;
            int i2 = InternalLinkActionCardPresentation.$stable;
            HatchInternalLinkActionCardKt.InternalLinkCardHeader(HatchCredentialsVaultCardKt.credentialsVaultTitle(internalLinkActionCardPresentation, str, bfm, i2), B1V.A00(bfm, new AnonymousClass1(this.$card, this.$settled, this.$settleSpec, this.$sawUnsaved$delegate), -1204954941), B1V.A00(bfm, new AnonymousClass2(this.$card, this.$passwordPageUrl), 1147903300), null, bfm, 432, 8);
            InternalLinkActionCardPresentation internalLinkActionCardPresentation2 = this.$card;
            boolean zA1K = AnonymousClass003.A1K(bfm, internalLinkActionCardPresentation2.url, internalLinkActionCardPresentation2.authProviders);
            InternalLinkActionCardPresentation internalLinkActionCardPresentation3 = this.$card;
            Object objAaT = bfm.AaT();
            if (zA1K || objAaT == C78N.A00) {
                objAaT = HatchCredentialsVaultCardKt.onePasswordHandoffFor(internalLinkActionCardPresentation3);
                bfm.Ai0(objAaT);
            }
            OnePasswordHandoff onePasswordHandoff = (OnePasswordHandoff) objAaT;
            if (onePasswordHandoff != null && !this.$settled) {
                bfm.AgE(-1832314597);
                HatchOnePasswordCardButtonKt.HatchOnePasswordCardButton(onePasswordHandoff, this.$card.type, this.$sourceSessionId, null, bfm, OnePasswordHandoff.$stable, 8);
            } else {
                bfm.AgE(-1832155071);
            }
            AnonymousClass001.A1D(bfm);
            InternalLinkActionCardPresentation internalLinkActionCardPresentation4 = this.$card;
            SavedCredential savedCredential = this.$saved;
            AOe<Float> aOe = this.$settleSpec;
            String str2 = this.$sourceSessionId;
            if (onePasswordHandoff != null) {
                z = true;
            }
            HatchCredentialsVaultCardKt.CredentialsVaultButton(internalLinkActionCardPresentation4, savedCredential, aOe, str2, z, null, bfm, i2, 32);
            return;
        }
        bfm.Afo();
    }
}
