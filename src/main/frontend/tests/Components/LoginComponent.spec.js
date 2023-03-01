import { describe, expect, test } from "vitest";

import { mount } from "@vue/test-utils";
import LoginComponent  from '../../src/components/login/LoginComponent.vue';

describe('LoginComponent', () => {

  test('should have login', () => {
    const wrapper = mount(LoginComponent)
    const value = wrapper.find('h1').text()
    expect(value).toBe('login')
})

test('should render username input', () => {
  const wrapper = mount(LoginComponent)
  expect(wrapper.find('[label="User Name"]').exists()).toBe(true)
})

test('should render password input ', () => {
  const wrapper = mount(LoginComponent)
  expect(wrapper.find('[label="Password"]').exists()).toBe(true)
})
});

