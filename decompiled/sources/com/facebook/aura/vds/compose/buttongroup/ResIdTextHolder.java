package com.facebook.aura.vds.compose.buttongroup;

import X.C06G;
import X.C7384Etj;
import android.content.Context;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ResIdTextHolder extends C06G implements TextHolder {
    public final int buttonText;
    public final Object[] textArgs;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ResIdTextHolder) {
                ResIdTextHolder resIdTextHolder = (ResIdTextHolder) obj;
                if (this.buttonText != resIdTextHolder.buttonText || !C7384Etj.areEqual(this.textArgs, resIdTextHolder.textArgs)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.facebook.aura.vds.compose.buttongroup.TextHolder
    public String getText(Context context) {
        C7384Etj.A0Y(context, 0);
        Object[] objArr = this.textArgs;
        return objArr != null ? context.getString(this.buttonText, Arrays.copyOf(objArr, objArr.length)) : context.getString(this.buttonText);
    }

    public static /* synthetic */ ResIdTextHolder copy$default(ResIdTextHolder resIdTextHolder, int i, Object[] objArr, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = resIdTextHolder.buttonText;
        }
        if ((i2 & 2) != 0) {
            objArr = resIdTextHolder.textArgs;
        }
        return new ResIdTextHolder(i, objArr);
    }

    public final int component1() {
        return this.buttonText;
    }

    public final Object[] component2() {
        return this.textArgs;
    }

    public final ResIdTextHolder copy(int i, Object[] objArr) {
        return new ResIdTextHolder(i, objArr);
    }

    public final int getButtonText() {
        return this.buttonText;
    }

    public final Object[] getTextArgs() {
        return this.textArgs;
    }

    public int hashCode() {
        int i = this.buttonText * 31;
        Object[] objArr = this.textArgs;
        return i + (objArr == null ? 0 : Arrays.hashCode(objArr));
    }

    public ResIdTextHolder(int i, Object[] objArr) {
        this.buttonText = i;
        this.textArgs = objArr;
    }

    public String toString() {
        return super.toString();
    }
}
