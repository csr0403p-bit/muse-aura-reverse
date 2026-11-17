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
public final class TextWithButtonPresentationData extends C06G implements HatchPresentationData {
    public final TextWithButtonPresentation textWithButton;
    public static final Companion Companion = new Companion();
    public static final int $stable = TextWithButtonPresentation.$stable;

    public final class Companion {
        public final C9hr<TextWithButtonPresentationData> serializer() {
            return TextWithButtonPresentationData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final TextWithButtonPresentationData copy(TextWithButtonPresentation textWithButtonPresentation) {
        C7384Etj.A0Y(textWithButtonPresentation, 0);
        return new TextWithButtonPresentationData(textWithButtonPresentation);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof TextWithButtonPresentationData) && C7384Etj.areEqual(this.textWithButton, ((TextWithButtonPresentationData) obj).textWithButton));
    }

    public /* synthetic */ TextWithButtonPresentationData(int i, TextWithButtonPresentation textWithButtonPresentation, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(TextWithButtonPresentationData$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.textWithButton = textWithButtonPresentation;
    }

    public static /* synthetic */ TextWithButtonPresentationData copy$default(TextWithButtonPresentationData textWithButtonPresentationData, TextWithButtonPresentation textWithButtonPresentation, int i, Object obj) {
        if ((i & 1) != 0) {
            textWithButtonPresentation = textWithButtonPresentationData.textWithButton;
        }
        C7384Etj.A0Y(textWithButtonPresentation, 0);
        return new TextWithButtonPresentationData(textWithButtonPresentation);
    }

    public final TextWithButtonPresentation component1() {
        return this.textWithButton;
    }

    public final TextWithButtonPresentation getTextWithButton() {
        return this.textWithButton;
    }

    public int hashCode() {
        return this.textWithButton.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public TextWithButtonPresentationData(TextWithButtonPresentation textWithButtonPresentation) {
        C7384Etj.A0Y(textWithButtonPresentation, 0);
        this.textWithButton = textWithButtonPresentation;
    }
}
