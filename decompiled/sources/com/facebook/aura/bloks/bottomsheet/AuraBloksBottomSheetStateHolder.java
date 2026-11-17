package com.facebook.aura.bloks.bottomsheet;

import X.AGI;
import X.AHD;
import X.AHI;
import X.AbstractC0878AGe;
import X.BLG;
import X.C06G;
import X.C06H;
import X.C1BN;
import X.C3Pi;
import X.C3cG;
import X.C7384Etj;
import X.C9286GCn;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes4.dex */
public final class AuraBloksBottomSheetStateHolder {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public static final AuraBloksBottomSheetStateHolder instance = new AuraBloksBottomSheetStateHolder();
    public final BLG<UiState> _uiState;
    public final C1BN<UiState> uiState;

    public final class Companion {
        public final AuraBloksBottomSheetStateHolder getInstance() {
            return AuraBloksBottomSheetStateHolder.instance;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final class UiState extends C06G {
        public static final int $stable = AuraBloksBottomSheetData.$stable;
        public final AHD<AuraBloksBottomSheetData> bottomSheetDataStack;

        public final UiState copy(AHD<AuraBloksBottomSheetData> ahd) {
            C7384Etj.A0Y(ahd, 0);
            return new UiState(ahd);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof UiState) && C7384Etj.areEqual(this.bottomSheetDataStack, ((UiState) obj).bottomSheetDataStack));
        }

        public /* synthetic */ UiState(AHD ahd, int i, C06H c06h) {
            this((i & 1) != 0 ? AHI.A01 : ahd);
        }

        public static /* synthetic */ UiState copy$default(UiState uiState, AHD ahd, int i, Object obj) {
            if ((i & 1) != 0) {
                ahd = uiState.bottomSheetDataStack;
            }
            C7384Etj.A0Y(ahd, 0);
            return new UiState(ahd);
        }

        public final AHD<AuraBloksBottomSheetData> component1() {
            return this.bottomSheetDataStack;
        }

        public final AHD<AuraBloksBottomSheetData> getBottomSheetDataStack() {
            return this.bottomSheetDataStack;
        }

        public int hashCode() {
            return this.bottomSheetDataStack.hashCode();
        }

        public String toString() {
            return super.toString();
        }

        public UiState(AHD<AuraBloksBottomSheetData> ahd) {
            C7384Etj.A0Y(ahd, 0);
            this.bottomSheetDataStack = ahd;
        }

        public UiState() {
            this(AHI.A01);
        }
    }

    public final void addBottomSheetData(AuraBloksBottomSheetData auraBloksBottomSheetData) {
        UiState value;
        AHD ahdA07;
        C7384Etj.A0Y(auraBloksBottomSheetData, 0);
        ArrayList arrayListA0R = AbstractC0878AGe.A0R(this.uiState.getValue().bottomSheetDataStack);
        arrayListA0R.add(auraBloksBottomSheetData);
        BLG<UiState> blg = this._uiState;
        do {
            value = blg.getValue();
            ahdA07 = AGI.A07(arrayListA0R);
            C7384Etj.A0Y(ahdA07, 0);
        } while (!blg.A6e(value, new UiState(ahdA07)));
    }

    public final void setBottomSheetData(AuraBloksBottomSheetData auraBloksBottomSheetData) {
        C7384Etj.A0Y(auraBloksBottomSheetData, 0);
        BLG<UiState> blg = this._uiState;
        while (!blg.A6e(blg.getValue(), new UiState(AGI.A07(Collections.singletonList(auraBloksBottomSheetData))))) {
        }
    }

    public final void clearBottomSheetData() {
        BLG<UiState> blg = this._uiState;
        while (!blg.A6e(blg.getValue(), new UiState(AHI.A01))) {
        }
    }

    public final C1BN<UiState> getUiState() {
        return this.uiState;
    }

    public final boolean popBottomSheetData() {
        if (this.uiState.getValue().bottomSheetDataStack.size() <= 1) {
            return false;
        }
        ArrayList arrayListA0R = AbstractC0878AGe.A0R(this.uiState.getValue().bottomSheetDataStack);
        arrayListA0R.remove(arrayListA0R.size() - 1);
        BLG<UiState> blg = this._uiState;
        while (!blg.A6e(blg.getValue(), new UiState(AGI.A06(arrayListA0R)))) {
        }
        return true;
    }

    public AuraBloksBottomSheetStateHolder() {
        C9286GCn c9286GCnA14 = C3cG.A14(new UiState(AHI.A01));
        this._uiState = c9286GCnA14;
        this.uiState = C3Pi.A00(c9286GCnA14);
    }
}
