package com.google.gson;

import X.AnonymousClass007;
import X.BV4;
import X.BV8;
import X.C3cG;
import X.C6714EWu;
import X.C6733EXr;
import X.C79;
import X.EYB;
import java.io.IOException;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: classes5.dex */
public abstract class JsonElement {
    public abstract JsonElement deepCopy();

    public JsonArray getAsJsonArray() {
        if (this instanceof JsonArray) {
            return (JsonArray) this;
        }
        throw C3cG.A0Q(AnonymousClass007.A0a("Not a JSON Array: ", this));
    }

    public C6714EWu getAsJsonNull() {
        if (this instanceof C6714EWu) {
            return (C6714EWu) this;
        }
        throw C3cG.A0Q(AnonymousClass007.A0a("Not a JSON Null: ", this));
    }

    public JsonObject getAsJsonObject() {
        if (this instanceof JsonObject) {
            return (JsonObject) this;
        }
        throw C3cG.A0Q(AnonymousClass007.A0a("Not a JSON Object: ", this));
    }

    public JsonPrimitive getAsJsonPrimitive() {
        if (this instanceof JsonPrimitive) {
            return (JsonPrimitive) this;
        }
        throw C3cG.A0Q(AnonymousClass007.A0a("Not a JSON Primitive: ", this));
    }

    public boolean isJsonArray() {
        return this instanceof JsonArray;
    }

    public boolean isJsonNull() {
        return this instanceof C6714EWu;
    }

    public boolean isJsonObject() {
        return this instanceof JsonObject;
    }

    public boolean isJsonPrimitive() {
        return this instanceof JsonPrimitive;
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            C6733EXr c6733EXr = new C6733EXr(stringWriter);
            c6733EXr.A01 = C79.A00;
            EYB.A0F.write(c6733EXr, this);
            return stringWriter.toString();
        } catch (IOException e) {
            throw BV4.A0N(e);
        }
    }

    @Deprecated
    public JsonElement() {
    }

    public BigDecimal getAsBigDecimal() {
        throw BV8.A16(this);
    }

    public BigInteger getAsBigInteger() {
        throw BV8.A16(this);
    }

    public boolean getAsBoolean() {
        throw BV8.A16(this);
    }

    public byte getAsByte() {
        throw BV8.A16(this);
    }

    @Deprecated
    public char getAsCharacter() {
        throw BV8.A16(this);
    }

    public double getAsDouble() {
        throw BV8.A16(this);
    }

    public float getAsFloat() {
        throw BV8.A16(this);
    }

    public int getAsInt() {
        throw BV8.A16(this);
    }

    public long getAsLong() {
        throw BV8.A16(this);
    }

    public Number getAsNumber() {
        throw BV8.A16(this);
    }

    public short getAsShort() {
        throw BV8.A16(this);
    }

    public String getAsString() {
        throw BV8.A16(this);
    }
}
