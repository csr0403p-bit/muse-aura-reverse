package com.google.gson;

import X.AnonymousClass001;
import X.BV4;
import X.BV8;
import X.C6716EWz;
import X.C8j3;
import X.EX0;
import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: classes5.dex */
public final class JsonPrimitive extends JsonElement {
    public final Object value;

    @Override // com.google.gson.JsonElement
    public /* bridge */ /* synthetic */ JsonElement deepCopy() {
        return this;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            JsonPrimitive jsonPrimitive = (JsonPrimitive) obj;
            Object obj2 = this.value;
            if (obj2 != null) {
                if (isIntegral(this) && isIntegral(jsonPrimitive)) {
                    return ((obj2 instanceof BigInteger) || (jsonPrimitive.value instanceof BigInteger)) ? getAsBigInteger().equals(jsonPrimitive.getAsBigInteger()) : getAsNumber().longValue() == jsonPrimitive.getAsNumber().longValue();
                }
                if (obj2 instanceof Number) {
                    Object obj3 = jsonPrimitive.value;
                    if (obj3 instanceof Number) {
                        if ((obj2 instanceof BigDecimal) && (obj3 instanceof BigDecimal)) {
                            return getAsBigDecimal().compareTo(jsonPrimitive.getAsBigDecimal()) == 0;
                        }
                        double asDouble = getAsDouble();
                        double asDouble2 = jsonPrimitive.getAsDouble();
                        if (asDouble != asDouble2) {
                            return Double.isNaN(asDouble) && Double.isNaN(asDouble2);
                        }
                    }
                }
                return obj2.equals(jsonPrimitive.value);
            }
            if (jsonPrimitive.value != null) {
                return false;
            }
        }
        return true;
    }

    public static boolean isIntegral(JsonPrimitive jsonPrimitive) {
        Object obj = jsonPrimitive.value;
        if (obj instanceof Number) {
            return (obj instanceof BigInteger) || (obj instanceof Long) || (obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte);
        }
        return false;
    }

    @Override // com.google.gson.JsonElement
    public BigDecimal getAsBigDecimal() {
        Object obj = this.value;
        return obj instanceof BigDecimal ? (BigDecimal) obj : EX0.A00(getAsString());
    }

    @Override // com.google.gson.JsonElement
    public BigInteger getAsBigInteger() {
        Object obj = this.value;
        if (obj instanceof BigInteger) {
            return (BigInteger) obj;
        }
        if (isIntegral(this)) {
            return BigInteger.valueOf(getAsNumber().longValue());
        }
        String asString = getAsString();
        EX0.A01(asString);
        return new BigInteger(asString);
    }

    @Override // com.google.gson.JsonElement
    public boolean getAsBoolean() {
        Object obj = this.value;
        return obj instanceof Boolean ? AnonymousClass001.A1X(obj) : Boolean.parseBoolean(getAsString());
    }

    @Override // com.google.gson.JsonElement
    public byte getAsByte() {
        return this.value instanceof Number ? getAsNumber().byteValue() : Byte.parseByte(getAsString());
    }

    @Override // com.google.gson.JsonElement
    public double getAsDouble() {
        return this.value instanceof Number ? getAsNumber().doubleValue() : Double.parseDouble(getAsString());
    }

    @Override // com.google.gson.JsonElement
    public float getAsFloat() {
        return this.value instanceof Number ? getAsNumber().floatValue() : Float.parseFloat(getAsString());
    }

    @Override // com.google.gson.JsonElement
    public int getAsInt() {
        return this.value instanceof Number ? getAsNumber().intValue() : Integer.parseInt(getAsString());
    }

    @Override // com.google.gson.JsonElement
    public long getAsLong() {
        return this.value instanceof Number ? getAsNumber().longValue() : Long.parseLong(getAsString());
    }

    @Override // com.google.gson.JsonElement
    public Number getAsNumber() {
        Object obj = this.value;
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof String) {
            return new C6716EWz((String) obj);
        }
        throw C8j3.A18("Primitive is neither a number nor a string");
    }

    @Override // com.google.gson.JsonElement
    public short getAsShort() {
        return this.value instanceof Number ? getAsNumber().shortValue() : Short.parseShort(getAsString());
    }

    @Override // com.google.gson.JsonElement
    public String getAsString() {
        Object asNumber = this.value;
        if (asNumber instanceof String) {
            return (String) asNumber;
        }
        if (asNumber instanceof Number) {
            asNumber = getAsNumber();
        } else if (!(asNumber instanceof Boolean)) {
            throw BV4.A0N(BV8.A0x("Unexpected value type: ", asNumber));
        }
        return asNumber.toString();
    }

    public int hashCode() {
        long jDoubleToLongBits;
        Object obj = this.value;
        if (obj == null) {
            return 31;
        }
        if (isIntegral(this)) {
            jDoubleToLongBits = getAsNumber().longValue();
        } else {
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(getAsNumber().doubleValue());
        }
        return (int) ((jDoubleToLongBits >>> 32) ^ jDoubleToLongBits);
    }

    public boolean isBoolean() {
        return this.value instanceof Boolean;
    }

    public boolean isNumber() {
        return this.value instanceof Number;
    }

    public boolean isString() {
        return this.value instanceof String;
    }

    public JsonPrimitive(Character ch) {
        ch.getClass();
        this.value = ch.toString();
    }

    @Override // com.google.gson.JsonElement
    @Deprecated
    public char getAsCharacter() {
        String asString = getAsString();
        if (asString.isEmpty()) {
            throw C8j3.A18("String value is empty");
        }
        return asString.charAt(0);
    }

    public JsonPrimitive(Boolean bool) {
        bool.getClass();
        this.value = bool;
    }

    @Override // com.google.gson.JsonElement
    public JsonPrimitive deepCopy() {
        return this;
    }

    public JsonPrimitive(String str) {
        str.getClass();
        this.value = str;
    }

    public JsonPrimitive(Number number) {
        number.getClass();
        this.value = number;
    }
}
