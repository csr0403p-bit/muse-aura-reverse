package com.facebook.aura.hotels;

import X.HtJ;
import X.HzP;
import com.facebook.aura.hotels.HotelSelectionViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.hotels.HotelSelectionViewModel$askAboutRooms$2", f = "HotelBrowseViewModels.kt", l = {240}, m = "invoke-BWLJW6A", v = 2)
/* renamed from: com.facebook.aura.hotels.HotelSelectionViewModel$askAboutRooms$2$invoke-BWLJW6A$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class HotelSelectionViewModel$askAboutRooms$2$invokeBWLJW6A$1 extends HzP {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HotelSelectionViewModel.AnonymousClass2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelSelectionViewModel$askAboutRooms$2$invokeBWLJW6A$1(HotelSelectionViewModel.AnonymousClass2 anonymousClass2, HtJ<? super HotelSelectionViewModel$askAboutRooms$2$invokeBWLJW6A$1> htJ) {
        super(htJ);
        this.this$0 = anonymousClass2;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(null, null, null, this);
    }
}
