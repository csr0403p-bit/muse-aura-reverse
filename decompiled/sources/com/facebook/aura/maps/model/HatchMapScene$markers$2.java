package com.facebook.aura.maps.model;

import X.AbstractC7559F3s;
import X.C3cG;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchMapScene$markers$2 extends AbstractC7559F3s implements Function0<List<? extends HatchMapMarker>> {
    public final /* synthetic */ HatchMapScene this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMapScene$markers$2(HatchMapScene hatchMapScene) {
        super(0);
        this.this$0 = hatchMapScene;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends HatchMapMarker> invoke() {
        List<HatchMapElement> list = this.this$0.elements;
        ArrayList arrayListA0h = C3cG.A0h();
        for (HatchMapElement hatchMapElement : list) {
            if (hatchMapElement instanceof HatchMapMarker) {
                arrayListA0h.add(hatchMapElement);
            }
        }
        return arrayListA0h;
    }
}
