import { describe, expect, test } from "vitest";

import { mount } from "@vue/test-utils";
import CardsComponent  from '../../src/components/login/CardsComponent.vue';

describe('CardsComponent', () => {

  test('should have title', () => {
    const wrapper = mount(CardsComponent)
    const value = wrapper.find('title').text()
    expect(value).toBe('title')
})
});