package com.facebook.aura.model;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class LetterBriefingWidgetContent extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final LetterBriefingWidgetData data;

    public final class Companion {
        public final C9hr<LetterBriefingWidgetContent> serializer() {
            return LetterBriefingWidgetContent$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final LetterBriefingWidgetContent copy(LetterBriefingWidgetData letterBriefingWidgetData) {
        C7384Etj.A0Y(letterBriefingWidgetData, 0);
        return new LetterBriefingWidgetContent(letterBriefingWidgetData);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof LetterBriefingWidgetContent) && C7384Etj.areEqual(this.data, ((LetterBriefingWidgetContent) obj).data));
    }

    public /* synthetic */ LetterBriefingWidgetContent(int i, LetterBriefingWidgetData letterBriefingWidgetData, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(LetterBriefingWidgetContent$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.data = letterBriefingWidgetData;
    }

    public static /* synthetic */ LetterBriefingWidgetContent copy$default(LetterBriefingWidgetContent letterBriefingWidgetContent, LetterBriefingWidgetData letterBriefingWidgetData, int i, Object obj) {
        if ((i & 1) != 0) {
            letterBriefingWidgetData = letterBriefingWidgetContent.data;
        }
        C7384Etj.A0Y(letterBriefingWidgetData, 0);
        return new LetterBriefingWidgetContent(letterBriefingWidgetData);
    }

    public final LetterBriefingWidgetData component1() {
        return this.data;
    }

    public final LetterBriefingWidgetData getData() {
        return this.data;
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public LetterBriefingWidgetContent(LetterBriefingWidgetData letterBriefingWidgetData) {
        C7384Etj.A0Y(letterBriefingWidgetData, 0);
        this.data = letterBriefingWidgetData;
    }
}
