package com.facebook.aura.navigation;

import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.B1V;
import X.BFM;
import X.BLi;
import X.BMI;
import X.BRL;
import X.C7384Etj;
import X.G0U;
import X.G0V;
import X.HtJ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.vds.compose.bottomsheet.state.AuraSheetState;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class BottomSheetScene<T> implements BLi<T> {
    public final G0V<BFM, Integer, Unit> content;
    public final Object key;
    public final G0U<BottomSheetScene<T>, Unit> onRemoved;
    public AuraSheetState retainedSheetState;
    public final MutableState sceneState$delegate;

    public static /* synthetic */ void getContent$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BottomSheetSceneState<T> getSceneState() {
        return (BottomSheetSceneState) this.sceneState$delegate.getValue();
    }

    private final void setSceneState(BottomSheetSceneState<T> bottomSheetSceneState) {
        this.sceneState$delegate.Af8(bottomSheetSceneState);
    }

    @Override // X.AMP
    public G0V<BFM, Integer, Unit> getContent() {
        return this.content;
    }

    @Override // X.AMP
    public Object getKey() {
        return this.key;
    }

    @Override // X.BLi
    public Object onRemove(HtJ<? super Unit> htJ) {
        this.onRemoved.invoke(this);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BottomSheetScene(Object obj, BottomSheetSceneState<T> bottomSheetSceneState, G0U<? super BottomSheetScene<T>, Unit> g0u) {
        boolean zA1Z = AnonymousClass005.A1Z(obj, bottomSheetSceneState, g0u);
        this.key = obj;
        this.onRemoved = g0u;
        this.sceneState$delegate = AnonymousClass002.A0P(bottomSheetSceneState);
        this.content = B1V.A01(new BottomSheetScene$content$1(this), 1056308386, zA1Z);
    }

    @Override // X.AMP
    public List<BRL<T>> getEntries() {
        return getSceneState().sheetEntries;
    }

    public /* bridge */ Map<String, Object> getMetadata() {
        return BMI.A00(this);
    }

    @Override // X.BLi
    public List<BRL<T>> getOverlaidEntries() {
        return getSceneState().overlaidEntries;
    }

    @Override // X.AMP
    public List<BRL<T>> getPreviousEntries() {
        return getSceneState().overlaidEntries;
    }

    public final void update(List<BRL<T>> list, List<BRL<T>> list2) {
        AnonymousClass003.A0u(list, list2);
        BottomSheetSceneState<T> bottomSheetSceneState = new BottomSheetSceneState<>(list, list2);
        if (C7384Etj.areEqual(getSceneState().sheetEntries, bottomSheetSceneState.sheetEntries) && C7384Etj.areEqual(getSceneState().overlaidEntries, bottomSheetSceneState.overlaidEntries)) {
            return;
        }
        setSceneState(bottomSheetSceneState);
    }
}
