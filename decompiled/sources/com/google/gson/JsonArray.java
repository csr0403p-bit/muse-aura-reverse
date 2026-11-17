package com.google.gson;

import X.BV6;
import X.BV7;
import X.C3cG;
import X.C60O;
import X.C6714EWu;
import X.C7439Ew1;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class JsonArray extends JsonElement implements Iterable<JsonElement> {
    public final ArrayList<JsonElement> elements;

    private JsonElement getAsSingleElement() {
        ArrayList<JsonElement> arrayList = this.elements;
        int size = arrayList.size();
        if (size == 1) {
            return (JsonElement) BV6.A0m(arrayList);
        }
        throw BV7.A0l("Array must have size 1, but has size ", size);
    }

    public void add(Boolean bool) {
        this.elements.add(bool == null ? C6714EWu.A00 : new JsonPrimitive(bool));
    }

    public void addAll(JsonArray jsonArray) {
        this.elements.addAll(jsonArray.elements);
    }

    public List<JsonElement> asList() {
        return new C7439Ew1(this.elements);
    }

    public boolean contains(JsonElement jsonElement) {
        return this.elements.contains(jsonElement);
    }

    @Override // com.google.gson.JsonElement
    public JsonArray deepCopy() {
        ArrayList<JsonElement> arrayList = this.elements;
        if (arrayList.isEmpty()) {
            return new JsonArray();
        }
        JsonArray jsonArray = new JsonArray(arrayList.size());
        Iterator<JsonElement> it = this.elements.iterator();
        while (it.hasNext()) {
            jsonArray.add(it.next().deepCopy());
        }
        return jsonArray;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof JsonArray) && ((JsonArray) obj).elements.equals(this.elements);
        }
        return true;
    }

    public JsonElement get(int i) {
        return this.elements.get(i);
    }

    public int hashCode() {
        return this.elements.hashCode();
    }

    public boolean isEmpty() {
        return this.elements.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<JsonElement> iterator() {
        return this.elements.iterator();
    }

    public JsonElement remove(int i) {
        return this.elements.remove(i);
    }

    public JsonElement set(int i, JsonElement jsonElement) {
        ArrayList<JsonElement> arrayList = this.elements;
        if (jsonElement == null) {
            jsonElement = C6714EWu.A00;
        }
        return arrayList.set(i, jsonElement);
    }

    public int size() {
        return this.elements.size();
    }

    public JsonArray(int i) {
        this.elements = C60O.A11(i);
    }

    @Override // com.google.gson.JsonElement
    public BigDecimal getAsBigDecimal() {
        return getAsSingleElement().getAsBigDecimal();
    }

    @Override // com.google.gson.JsonElement
    public BigInteger getAsBigInteger() {
        return getAsSingleElement().getAsBigInteger();
    }

    @Override // com.google.gson.JsonElement
    public boolean getAsBoolean() {
        return getAsSingleElement().getAsBoolean();
    }

    @Override // com.google.gson.JsonElement
    public byte getAsByte() {
        return getAsSingleElement().getAsByte();
    }

    @Override // com.google.gson.JsonElement
    @Deprecated
    public char getAsCharacter() {
        return getAsSingleElement().getAsCharacter();
    }

    @Override // com.google.gson.JsonElement
    public double getAsDouble() {
        return getAsSingleElement().getAsDouble();
    }

    @Override // com.google.gson.JsonElement
    public float getAsFloat() {
        return getAsSingleElement().getAsFloat();
    }

    @Override // com.google.gson.JsonElement
    public int getAsInt() {
        return getAsSingleElement().getAsInt();
    }

    @Override // com.google.gson.JsonElement
    public long getAsLong() {
        return getAsSingleElement().getAsLong();
    }

    @Override // com.google.gson.JsonElement
    public Number getAsNumber() {
        return getAsSingleElement().getAsNumber();
    }

    @Override // com.google.gson.JsonElement
    public short getAsShort() {
        return getAsSingleElement().getAsShort();
    }

    @Override // com.google.gson.JsonElement
    public String getAsString() {
        return getAsSingleElement().getAsString();
    }

    public JsonArray() {
        this.elements = C3cG.A0h();
    }

    public void add(Character ch) {
        JsonElement jsonPrimitive;
        ArrayList<JsonElement> arrayList = this.elements;
        if (ch == null) {
            jsonPrimitive = C6714EWu.A00;
        } else {
            jsonPrimitive = new JsonPrimitive(ch);
        }
        arrayList.add(jsonPrimitive);
    }

    public boolean remove(JsonElement jsonElement) {
        return this.elements.remove(jsonElement);
    }

    public void add(JsonElement jsonElement) {
        if (jsonElement == null) {
            jsonElement = C6714EWu.A00;
        }
        this.elements.add(jsonElement);
    }

    public void add(Number number) {
        JsonElement jsonPrimitive;
        ArrayList<JsonElement> arrayList = this.elements;
        if (number == null) {
            jsonPrimitive = C6714EWu.A00;
        } else {
            jsonPrimitive = new JsonPrimitive(number);
        }
        arrayList.add(jsonPrimitive);
    }

    public void add(String str) {
        this.elements.add(str == null ? C6714EWu.A00 : new JsonPrimitive(str));
    }
}
