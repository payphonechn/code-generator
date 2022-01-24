<template>
  <button @click="get_money">{{ msg }}</button>
</template>

<script>
  import { test } from '@/api/addDb'
  export default {
    data() {
      return {
        msg: '点击',
        money: '20',
      };
    },

    methods: {
      get_money() {
        test()
      }
    }
  };
</script>
