<template>
  <div class="dashboard-container">
    <div class="dashboard-text">name: {{ name }}</div>
  </div>
</template>

<script>
  import  { getInfo  } from '@/api/addDb.js'

  const params = { id: 1234}
  getInfo(params).then(res=>{
    console.log(res)
  }).catch(e=>{
    console.log(e)
  })
</script>

<style lang="scss" scoped>
.dashboard {
  &-container {
    margin: 30px;
  }
  &-text {
    font-size: 30px;
    line-height: 46px;
  }
}
</style>
